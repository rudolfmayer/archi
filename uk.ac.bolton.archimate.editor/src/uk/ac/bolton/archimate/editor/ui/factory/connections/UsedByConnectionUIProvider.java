/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.editor.ui.factory.connections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uk.ac.bolton.archimate.editor.diagram.editparts.connections.UsedByConnectionEditPart;
import uk.ac.bolton.archimate.editor.ui.IArchimateImages;
import uk.ac.bolton.archimate.model.IArchimatePackage;


/**
 * UsedBy Connection UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class UsedByConnectionUIProvider extends AbstractConnectionUIProvider {

    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getUsedByRelationship();
    }
    
    @Override
    public EditPart createEditPart() {
        return new UsedByConnectionEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.UsedByConnectionUIProvider_0;
    }

    @Override
    public String getDefaultShortName() {
        return Messages.UsedByConnectionUIProvider_1;
    }

    @Override
    public Image getImage() {
        return IArchimateImages.ImageFactory.getImage(IArchimateImages.ICON_USED_BY_CONNECTION_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IArchimateImages.ImageFactory.getImageDescriptor(IArchimateImages.ICON_USED_BY_CONNECTION_16);
    }
}
