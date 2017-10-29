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
import com.tools20022.repository.choice.ExpectedCollateral1Choice;
import com.tools20022.repository.choice.ExpectedCollateral2Choice;
import com.tools20022.repository.codeset.CollateralTypeCode;
import com.tools20022.repository.msg.ExpectedCollateral1;
import com.tools20022.repository.msg.ExpectedCollateral2;
import com.tools20022.repository.msg.ExpectedCollateralMovement1;
import com.tools20022.repository.msg.ExpectedCollateralMovement2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Expected collateral type.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ExpectedCollateralType"
 * src="doc-files/ExpectedCollateralType.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#VariationMarginRelatedCall
 * ExpectedCollateralType.VariationMarginRelatedCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#Delivery
 * ExpectedCollateralType.Delivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#Return
 * ExpectedCollateralType.Return}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#SegregatedIndependentAmountRelatedCall
 * ExpectedCollateralType.SegregatedIndependentAmountRelatedCall}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#ExpectedVariationMarginType
 * MarginCall.ExpectedVariationMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#ExpectedSegregatedIndependentAmountType
 * MarginCall.ExpectedSegregatedIndependentAmountType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral1#VariationMargin
 * ExpectedCollateral1.VariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral1#SegregatedIndependentAmount
 * ExpectedCollateral1.SegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice#ExpectedCollateralDetails
 * ExpectedCollateral1Choice.ExpectedCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice#SegregatedIndependentAmount
 * ExpectedCollateral1Choice.SegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice#ExpectedCollateralDetails
 * ExpectedCollateral2Choice.ExpectedCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice#SegregatedIndependentAmount
 * ExpectedCollateral2Choice.SegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#ExpectedCollateralDueToA
 * MarginCall2.ExpectedCollateralDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#ExpectedCollateralDueToB
 * MarginCall2.ExpectedCollateralDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral2#VariationMargin
 * ExpectedCollateral2.VariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral2#SegregatedIndependentAmount
 * ExpectedCollateral2.SegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1
 * ExpectedCollateralMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedCollateral1
 * ExpectedCollateral1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice
 * ExpectedCollateral1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
 * ExpectedCollateral2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedCollateral2
 * ExpectedCollateral2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2
 * ExpectedCollateralMovement2}</li>
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
 * "ExpectedCollateralType"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Expected collateral type."</li>
 * </ul>
 */
public class ExpectedCollateralType {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Call for which a variation margin type is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#ExpectedVariationMarginType
	 * MarginCall.ExpectedVariationMarginType}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginRelatedCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Call for which a variation margin type is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VariationMarginRelatedCall = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRelatedCall";
			definition = "Call for which a variation margin type is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MarginCall.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.ExpectedVariationMarginType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of collateral that will be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1#Delivery
	 * ExpectedCollateralMovement1.Delivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2#Delivery
	 * ExpectedCollateralMovement2.Delivery}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of collateral that will be delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Delivery = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedCollateralMovement1.Delivery, com.tools20022.repository.msg.ExpectedCollateralMovement2.Delivery);
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delivery";
			definition = "Type of collateral that will be delivered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}
	};
	/**
	 * Type of collateral that will be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1#Return
	 * ExpectedCollateralMovement1.Return}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2#Return
	 * ExpectedCollateralMovement2.Return}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of collateral that will be returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Return = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedCollateralMovement1.Return, com.tools20022.repository.msg.ExpectedCollateralMovement2.Return);
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Return";
			definition = "Type of collateral that will be returned.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}
	};
	/**
	 * Call for which a segregated independent amount type is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#ExpectedSegregatedIndependentAmountType
	 * MarginCall.ExpectedSegregatedIndependentAmountType}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountRelatedCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Call for which a segregated independent amount type is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SegregatedIndependentAmountRelatedCall = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRelatedCall";
			definition = "Call for which a segregated independent amount type is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MarginCall.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.ExpectedSegregatedIndependentAmountType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExpectedCollateralType";
				definition = "Expected collateral type.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginCall.ExpectedVariationMarginType, com.tools20022.repository.entity.MarginCall.ExpectedSegregatedIndependentAmountType);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedCollateral1.VariationMargin, com.tools20022.repository.msg.ExpectedCollateral1.SegregatedIndependentAmount,
						com.tools20022.repository.choice.ExpectedCollateral1Choice.ExpectedCollateralDetails, com.tools20022.repository.choice.ExpectedCollateral1Choice.SegregatedIndependentAmount,
						com.tools20022.repository.choice.ExpectedCollateral2Choice.ExpectedCollateralDetails, com.tools20022.repository.choice.ExpectedCollateral2Choice.SegregatedIndependentAmount,
						com.tools20022.repository.msg.MarginCall2.ExpectedCollateralDueToA, com.tools20022.repository.msg.MarginCall2.ExpectedCollateralDueToB, com.tools20022.repository.msg.ExpectedCollateral2.VariationMargin,
						com.tools20022.repository.msg.ExpectedCollateral2.SegregatedIndependentAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExpectedCollateralType.VariationMarginRelatedCall, com.tools20022.repository.entity.ExpectedCollateralType.Delivery,
						com.tools20022.repository.entity.ExpectedCollateralType.Return, com.tools20022.repository.entity.ExpectedCollateralType.SegregatedIndependentAmountRelatedCall);
				derivationComponent_lazy = () -> Arrays.asList(ExpectedCollateralMovement1.mmObject(), ExpectedCollateral1.mmObject(), ExpectedCollateral1Choice.mmObject(), ExpectedCollateral2Choice.mmObject(),
						ExpectedCollateral2.mmObject(), ExpectedCollateralMovement2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}