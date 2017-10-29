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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.MarginResult1Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the agreed amount and the collateral movement direction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralMovement" src="doc-files/CollateralMovement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#RelatedCollateralProposal
 * CollateralMovement.RelatedCollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#VariationMargin
 * CollateralMovement.VariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#SegregatedIndependentAmount
 * CollateralMovement.SegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#MarginCall
 * CollateralMovement.MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#SecuritiesCollateralMovement
 * CollateralMovement.SecuritiesCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#CashCollateralMovement
 * CollateralMovement.CashCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#FinancialTransaction
 * CollateralMovement.FinancialTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedCollateralMovement
 * PaymentObligation.RelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedCollateralMovement
 * SecuritiesDeliveryObligation.RelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#CollateralMovement
 * MarginCall.CollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#ProposedCollateralMovement
 * CollateralProposal.ProposedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#CollateralMovement
 * FinancialTransaction.CollateralMovement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginResult1Choice#ExcessAmount
 * MarginResult1Choice.ExcessAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginResult1Choice#DeficitAmount
 * MarginResult1Choice.DeficitAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.MarginResult1Choice
 * MarginResult1Choice}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralMovement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the agreed amount and the collateral movement direction."</li>
 * </ul>
 */
public class CollateralMovement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collateral proposal for which collateral movements are detailed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#ProposedCollateralMovement
	 * CollateralProposal.ProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralProposal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral proposal for which collateral movements are detailed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralProposal = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralProposal";
			definition = "Collateral proposal for which collateral movements are detailed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralProposal.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralProposal.ProposedCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of margin that will be delivered to one party by the other party
	 * after rounding, threshold and minimum transfer amount are taken into
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse1#VariationMargin
	 * CollateralProposalResponse1.VariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposal2#VariationMargin
	 * CollateralProposal2.VariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposal3#VariationMargin
	 * CollateralProposal3.VariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposal4#VariationMargin
	 * CollateralProposal4.VariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse2#VariationMargin
	 * CollateralProposalResponse2.VariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposal5#VariationMargin
	 * CollateralProposal5.VariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse3#VariationMargin
	 * CollateralProposalResponse3.VariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposal6#VariationMargin
	 * CollateralProposal6.VariationMargin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VariationMargin = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralProposalResponse1.VariationMargin, com.tools20022.repository.msg.CollateralProposal2.VariationMargin,
					com.tools20022.repository.msg.CollateralProposal3.VariationMargin, com.tools20022.repository.msg.CollateralProposal4.VariationMargin, com.tools20022.repository.msg.CollateralProposalResponse2.VariationMargin,
					com.tools20022.repository.msg.CollateralProposal5.VariationMargin, com.tools20022.repository.msg.CollateralProposalResponse3.VariationMargin, com.tools20022.repository.msg.CollateralProposal6.VariationMargin);
			elementContext_lazy = () -> CollateralMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Amount of margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of margin that will be delivered to one party by the other party
	 * after rounding, threshold and minimum transfer amount are taken into
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse1#SegregatedIndependentAmount
	 * CollateralProposalResponse1.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse1Choice#SegregatedIndependentAmount
	 * CollateralProposalResponse1Choice.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposal2#SegregatedIndependentAmount
	 * CollateralProposal2.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal1Choice#SegregatedIndependentAmount
	 * CollateralProposal1Choice.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposal3#SegregatedIndependentAmount
	 * CollateralProposal3.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal2Choice#SegregatedIndependentAmount
	 * CollateralProposal2Choice.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal3Choice#SegregatedIndependentAmount
	 * CollateralProposal3Choice.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposal4#SegregatedIndependentAmount
	 * CollateralProposal4.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice#SegregatedIndependentAmount
	 * CollateralProposalResponse2Choice.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse2#SegregatedIndependentAmount
	 * CollateralProposalResponse2.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal4Choice#SegregatedIndependentAmount
	 * CollateralProposal4Choice.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposal5#SegregatedIndependentAmount
	 * CollateralProposal5.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice#SegregatedIndependentAmount
	 * CollateralProposalResponse3Choice.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal5Choice#SegregatedIndependentAmount
	 * CollateralProposal5Choice.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse3#SegregatedIndependentAmount
	 * CollateralProposalResponse3.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposal6#SegregatedIndependentAmount
	 * CollateralProposal6.SegregatedIndependentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SegregatedIndependentAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralProposalResponse1.SegregatedIndependentAmount, com.tools20022.repository.choice.CollateralProposalResponse1Choice.SegregatedIndependentAmount,
					com.tools20022.repository.msg.CollateralProposal2.SegregatedIndependentAmount, com.tools20022.repository.choice.CollateralProposal1Choice.SegregatedIndependentAmount,
					com.tools20022.repository.msg.CollateralProposal3.SegregatedIndependentAmount, com.tools20022.repository.choice.CollateralProposal2Choice.SegregatedIndependentAmount,
					com.tools20022.repository.choice.CollateralProposal3Choice.SegregatedIndependentAmount, com.tools20022.repository.msg.CollateralProposal4.SegregatedIndependentAmount,
					com.tools20022.repository.choice.CollateralProposalResponse2Choice.SegregatedIndependentAmount, com.tools20022.repository.msg.CollateralProposalResponse2.SegregatedIndependentAmount,
					com.tools20022.repository.choice.CollateralProposal4Choice.SegregatedIndependentAmount, com.tools20022.repository.msg.CollateralProposal5.SegregatedIndependentAmount,
					com.tools20022.repository.choice.CollateralProposalResponse3Choice.SegregatedIndependentAmount, com.tools20022.repository.choice.CollateralProposal5Choice.SegregatedIndependentAmount,
					com.tools20022.repository.msg.CollateralProposalResponse3.SegregatedIndependentAmount, com.tools20022.repository.msg.CollateralProposal6.SegregatedIndependentAmount);
			elementContext_lazy = () -> CollateralMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Amount of margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Magin call which needs to be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#CollateralMovement
	 * MarginCall.CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Magin call which needs to be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MarginCall = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCall";
			definition = "Magin call which needs to be executed.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.CollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Movement of assets in relation with collateral updates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedCollateralMovement
	 * SecuritiesDeliveryObligation.RelatedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Movement of assets in relation with collateral updates."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesCollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateralMovement";
			definition = "Movement of assets in relation with collateral updates.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Movement of assets in relation with collateral updates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedCollateralMovement
	 * PaymentObligation.RelatedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Movement of assets in relation with collateral updates."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashCollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateralMovement";
			definition = "Movement of assets in relation with collateral updates.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RelatedCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Financial transaction to which the collateral management is associated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#CollateralMovement
	 * FinancialTransaction.CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial transaction to which the collateral management is associated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FinancialTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the collateral management is associated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.CollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralMovement";
				definition = "Provides the agreed amount and the collateral movement direction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.RelatedCollateralMovement, com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCollateralMovement,
						com.tools20022.repository.entity.MarginCall.CollateralMovement, com.tools20022.repository.entity.CollateralProposal.ProposedCollateralMovement,
						com.tools20022.repository.entity.FinancialTransaction.CollateralMovement);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarginResult1Choice.ExcessAmount, com.tools20022.repository.choice.MarginResult1Choice.DeficitAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralMovement.RelatedCollateralProposal, com.tools20022.repository.entity.CollateralMovement.VariationMargin,
						com.tools20022.repository.entity.CollateralMovement.SegregatedIndependentAmount, com.tools20022.repository.entity.CollateralMovement.MarginCall,
						com.tools20022.repository.entity.CollateralMovement.SecuritiesCollateralMovement, com.tools20022.repository.entity.CollateralMovement.CashCollateralMovement,
						com.tools20022.repository.entity.CollateralMovement.FinancialTransaction);
				derivationComponent_lazy = () -> Arrays.asList(MarginResult1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}