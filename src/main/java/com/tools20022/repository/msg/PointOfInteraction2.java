/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.PointOfInteraction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Point of interaction (POI) performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction2#Identification
 * PointOfInteraction2.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction2#SystemName
 * PointOfInteraction2.SystemName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction2#GroupIdentification
 * PointOfInteraction2.GroupIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction2#Capabilities
 * PointOfInteraction2.Capabilities}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction2#Component
 * PointOfInteraction2.Component}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
 * PointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PointOfInteraction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Point of interaction (POI) performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction3
 * PointOfInteraction3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction1
 * PointOfInteraction1}</li>
 * </ul>
 */
public class PointOfInteraction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the POI (Point Of Interaction) for the acquirer or its
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction2
	 * PointOfInteraction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI (Point Of Interaction) for the acquirer or its agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction3#Identification
	 * PointOfInteraction3.Identification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Identification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PointOfInteraction2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the POI (Point Of Interaction) for the acquirer or its agent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction3.Identification);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification32.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Common name assigned by the acquirer to the POI system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemName#Name
	 * SystemName.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction2
	 * PointOfInteraction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common name assigned by the acquirer to the POI system."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction3#SystemName
	 * PointOfInteraction3.SystemName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SystemName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteraction2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SystemName.Name;
			isDerived = false;
			xmlTag = "SysNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemName";
			definition = "Common name assigned by the acquirer to the POI system.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction3.SystemName);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Identifier assigned by the merchant identifying a set of POI terminals
	 * performing some categories of transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction2
	 * PointOfInteraction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction3#GroupIdentification
	 * PointOfInteraction3.GroupIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute GroupIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteraction2.mmObject();
			isDerived = false;
			xmlTag = "GrpId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupIdentification";
			definition = "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction3.GroupIdentification);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Capabilities of the POI performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1
	 * PointOfInteractionCapabilities1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction2
	 * PointOfInteraction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Capabilities of the POI performing the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction3#Capabilities
	 * PointOfInteraction3.Capabilities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Capabilities = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PointOfInteraction2.mmObject();
			businessComponentTrace_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			xmlTag = "Cpblties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capabilities";
			definition = "Capabilities of the POI performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction3.Capabilities);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PointOfInteractionCapabilities1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Data related to a component of the POI performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent3
	 * PointOfInteractionComponent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#Component
	 * PointOfInteraction.Component}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction2
	 * PointOfInteraction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmpnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Component"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to a component of the POI performing the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction3#Component
	 * PointOfInteraction3.Component}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Component = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PointOfInteraction2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.Component;
			isDerived = false;
			xmlTag = "Cmpnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Component";
			definition = "Data related to a component of the POI performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction3.Component);
			minOccurs = 0;
			type_lazy = () -> PointOfInteractionComponent3.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction2.Identification, com.tools20022.repository.msg.PointOfInteraction2.SystemName,
						com.tools20022.repository.msg.PointOfInteraction2.GroupIdentification, com.tools20022.repository.msg.PointOfInteraction2.Capabilities, com.tools20022.repository.msg.PointOfInteraction2.Component);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PointOfInteraction2";
				definition = "Point of interaction (POI) performing the transaction.";
				previousVersion_lazy = () -> PointOfInteraction1.mmObject();
				nextVersions_lazy = () -> Arrays.asList(PointOfInteraction3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}