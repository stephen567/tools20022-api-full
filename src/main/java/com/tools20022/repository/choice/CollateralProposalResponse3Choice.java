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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.msg.CollateralProposalResponse3;
import com.tools20022.repository.msg.CollateralProposalResponseType3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the collateral proposal response for the variation margin and the
 * segregated independent amount, or the segregated independent amount only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice#CollateralProposal
 * CollateralProposalResponse3Choice.CollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice#SegregatedIndependentAmount
 * CollateralProposalResponse3Choice.SegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralProposal
 * CollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalResponseV05#ProposalResponse
 * CollateralProposalResponseV05.ProposalResponse}</li>
 * </ul>
 * </li>
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
 * "CollateralProposalResponse3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the collateral proposal response for the variation margin and the segregated independent amount, or the segregated independent amount only."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice
 * CollateralProposalResponse2Choice}</li>
 * </ul>
 */
public class CollateralProposalResponse3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides the collateral proposal response for the variation margin and
	 * optionally the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse3
	 * CollateralProposalResponse3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#ProposedCollateralMovement
	 * CollateralProposal.ProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice
	 * CollateralProposalResponse3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrpsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral proposal response for the variation margin and optionally the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice#CollateralProposal
	 * CollateralProposalResponse2Choice.CollateralProposal}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CollateralProposal = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralProposalResponse3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralProposal.ProposedCollateralMovement;
			isDerived = false;
			xmlTag = "CollPrpsl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposal";
			definition = "Provides the collateral proposal response for the variation margin and optionally the segregated independent amount.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.CollateralProposalResponse2Choice.CollateralProposal;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralProposalResponse3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the collateral proposal response for the segregated independent
	 * amount only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3
	 * CollateralProposalResponseType3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#SegregatedIndependentAmount
	 * CollateralMovement.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice
	 * CollateralProposalResponse3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral proposal response for the segregated independent amount only."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice#SegregatedIndependentAmount
	 * CollateralProposalResponse2Choice.SegregatedIndependentAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SegregatedIndependentAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralProposalResponse3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralMovement.SegregatedIndependentAmount;
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the collateral proposal response for the segregated independent amount only.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.CollateralProposalResponse2Choice.SegregatedIndependentAmount;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralProposalResponseType3.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.CollateralProposalResponse3Choice.CollateralProposal, com.tools20022.repository.choice.CollateralProposalResponse3Choice.SegregatedIndependentAmount);
				trace_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.CollateralProposalResponseV05.ProposalResponse);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralProposalResponse3Choice";
				definition = "Provides the collateral proposal response for the variation margin and the segregated independent amount, or the segregated independent amount only.";
				previousVersion_lazy = () -> CollateralProposalResponse2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}