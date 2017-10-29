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
import com.tools20022.repository.choice.WaivingInstruction1Choice;
import com.tools20022.repository.choice.WaivingInstruction2Choice;
import com.tools20022.repository.codeset.WaivingInstructionCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.CommissionWaiver2;
import com.tools20022.repository.msg.CommissionWaiver3;
import com.tools20022.repository.msg.CommissionWaiver4;
import com.tools20022.repository.msg.WaivingType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Non-enforcement of the right to all or part of a commission by the party
 * entitled to the commission.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CommissionWaiver" src="doc-files/CommissionWaiver.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CommissionWaiver#Commission
 * CommissionWaiver.Commission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#InstructionBasis
 * CommissionWaiver.InstructionBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommissionWaiver#WaivedRate
 * CommissionWaiver.WaivedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#NonWaivedRate
 * CommissionWaiver.NonWaivedRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#CommissionWaiving
 * Commission.CommissionWaiving}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.WaivingType1 WaivingType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommissionWaiver2
 * CommissionWaiver2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommissionWaiver3
 * CommissionWaiver3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.WaivingInstruction1Choice
 * WaivingInstruction1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommissionWaiver4
 * CommissionWaiver4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.WaivingInstruction2Choice
 * WaivingInstruction2Choice}</li>
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
 * "CommissionWaiver"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Non-enforcement of the right to all or part of a commission by the party entitled to the commission."
 * </li>
 * </ul>
 */
public class CommissionWaiver {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Commission to which the waiver applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#CommissionWaiving
	 * Commission.CommissionWaiving}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver
	 * CommissionWaiver}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission to which the waiver applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission to which the waiver applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.CommissionWaiving;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Form of the rebate, eg, cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstructionCode
	 * WaivingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.WaivingType1#Structured
	 * WaivingType1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver2#InstructionBasis
	 * CommissionWaiver2.InstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#InstructionBasis
	 * CommissionWaiver3.InstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#ExtendedInstructionBasis
	 * CommissionWaiver3.ExtendedInstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.WaivingInstruction1Choice#Code
	 * WaivingInstruction1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.WaivingInstruction1Choice#Proprietary
	 * WaivingInstruction1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver4#InstructionBasis
	 * CommissionWaiver4.InstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.WaivingInstruction2Choice#Code
	 * WaivingInstruction2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.WaivingInstruction2Choice#Proprietary
	 * WaivingInstruction2Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver
	 * CommissionWaiver}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of the rebate, eg, cash."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.WaivingType1.Structured, com.tools20022.repository.msg.CommissionWaiver2.InstructionBasis, com.tools20022.repository.msg.CommissionWaiver3.InstructionBasis,
					com.tools20022.repository.msg.CommissionWaiver3.ExtendedInstructionBasis, com.tools20022.repository.choice.WaivingInstruction1Choice.Code, com.tools20022.repository.choice.WaivingInstruction1Choice.Proprietary,
					com.tools20022.repository.msg.CommissionWaiver4.InstructionBasis, com.tools20022.repository.choice.WaivingInstruction2Choice.Code, com.tools20022.repository.choice.WaivingInstruction2Choice.Proprietary);
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionBasis";
			definition = "Form of the rebate, eg, cash.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> WaivingInstructionCode.mmObject();
		}
	};
	/**
	 * Proportion of the commission that is waived, ie, if the commission is 5%
	 * and half is waived, 2.5% should be stated in this field.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver2#WaivedRate
	 * CommissionWaiver2.WaivedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#WaivedRate
	 * CommissionWaiver3.WaivedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver4#WaivedRate
	 * CommissionWaiver4.WaivedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver
	 * CommissionWaiver}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaivedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proportion of the commission that is waived, ie, if  the commission is 5% and half is waived, 2.5% should be stated in this field."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WaivedRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommissionWaiver2.WaivedRate, com.tools20022.repository.msg.CommissionWaiver3.WaivedRate, com.tools20022.repository.msg.CommissionWaiver4.WaivedRate);
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WaivedRate";
			definition = "Proportion of the commission that is waived, ie, if  the commission is 5% and half is waived, 2.5% should be stated in this field.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * New commission rate applied, after waiving.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver
	 * CommissionWaiver}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonWaivedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New commission rate applied, after waiving."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NonWaivedRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			isDerived = true;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonWaivedRate";
			definition = "New commission rate applied, after waiving.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CommissionWaiver";
				definition = "Non-enforcement of the right to all or part of a commission by the party entitled to the commission.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.CommissionWaiving);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommissionWaiver.Commission, com.tools20022.repository.entity.CommissionWaiver.InstructionBasis,
						com.tools20022.repository.entity.CommissionWaiver.WaivedRate, com.tools20022.repository.entity.CommissionWaiver.NonWaivedRate);
				derivationComponent_lazy = () -> Arrays.asList(WaivingType1.mmObject(), CommissionWaiver2.mmObject(), CommissionWaiver3.mmObject(), WaivingInstruction1Choice.mmObject(), CommissionWaiver4.mmObject(),
						WaivingInstruction2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}