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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.entity.CollateralProposal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the collateral movement direction that is a delivery and optionally
 * a return.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement11#Deliver
 * CollateralMovement11.Deliver}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement11#Return
 * CollateralMovement11.Return}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralProposal
 * CollateralProposal}</li>
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
 * "CollateralMovement11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the collateral movement direction that is a delivery and optionally a return."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralMovement8
 * CollateralMovement8}</li>
 * </ul>
 */
public class CollateralMovement11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides the collateral movement direction that is a delivery only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Collateral16
	 * Collateral16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#ProposedCollateralMovement
	 * CollateralProposal.ProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement11
	 * CollateralMovement11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dlvr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral movement direction that is a delivery only."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement8#Deliver
	 * CollateralMovement8.Deliver}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Deliver = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralMovement11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralProposal.ProposedCollateralMovement;
			isDerived = false;
			xmlTag = "Dlvr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deliver";
			definition = "Provides the collateral movement direction that is a delivery only.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CollateralMovement8.Deliver;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Collateral16.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the collateral movement direction that is a return only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Collateral17
	 * Collateral17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#ProposedCollateralMovement
	 * CollateralProposal.ProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement11
	 * CollateralMovement11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral movement direction that is a return only."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement8#Return
	 * CollateralMovement8.Return}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Return = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralMovement11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralProposal.ProposedCollateralMovement;
			isDerived = false;
			xmlTag = "Rtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Return";
			definition = "Provides the collateral movement direction that is a return only.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CollateralMovement8.Return;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Collateral17.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralMovement11.Deliver, com.tools20022.repository.msg.CollateralMovement11.Return);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralMovement11";
				definition = "Provides the collateral movement direction that is a delivery and optionally a return.";
				previousVersion_lazy = () -> CollateralMovement8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}