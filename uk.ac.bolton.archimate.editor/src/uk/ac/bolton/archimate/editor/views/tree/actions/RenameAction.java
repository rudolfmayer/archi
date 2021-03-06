/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.editor.views.tree.actions;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchCommandConstants;

import uk.ac.bolton.archimate.editor.views.tree.TreeModelViewer;
import uk.ac.bolton.archimate.editor.views.tree.commands.RenameCommandHandler;


/**
 * Rename Action
 * 
 * @author Phillip Beauvoir
 */
public class RenameAction extends ViewerAction {
    
    public RenameAction(TreeModelViewer selectionProvider) {
        super(selectionProvider);
        setText(Messages.RenameAction_0);
        setEnabled(false);
        setActionDefinitionId(IWorkbenchCommandConstants.FILE_RENAME); // register key binding
    }
    
    @Override
    public void run() {
        IStructuredSelection selection = getSelection();
        if(selection == null || selection.isEmpty()) {
            return;
        }

        Object element = selection.getFirstElement();
        if(RenameCommandHandler.canRename(element)) {
            ((TreeModelViewer)getSelectionProvider()).editElement(element);
        }
    }

    @Override
    public void update(IStructuredSelection selection) {
        setEnabled(selection.size() == 1 && RenameCommandHandler.canRename(selection.getFirstElement()));
    }

}
