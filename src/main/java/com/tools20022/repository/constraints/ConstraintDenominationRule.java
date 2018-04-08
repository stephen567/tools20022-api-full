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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * Unless bilaterally agreed between the account owner and servicer, if
 * DenominationChoice is used, it must not contain information that can be
 * provided in a structured field.
 */
public class ConstraintDenominationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount57
	 * ConstraintDenominationRule.forQuantityAndAccount57}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount51> forQuantityAndAccount51 = new MMConstraint<QuantityAndAccount51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount57);
			owner_lazy = () -> QuantityAndAccount51.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount51 obj) throws Exception {
			checkQuantityAndAccount51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55
	 * QuantityAndAccount55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount60
	 * ConstraintDenominationRule.forQuantityAndAccount60}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount55> forQuantityAndAccount55 = new MMConstraint<QuantityAndAccount55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount60);
			owner_lazy = () -> QuantityAndAccount55.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount55 obj) throws Exception {
			checkQuantityAndAccount55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72
	 * QuantityAndAccount72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount72> forQuantityAndAccount72 = new MMConstraint<QuantityAndAccount72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount72.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount72 obj) throws Exception {
			checkQuantityAndAccount72(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33
	 * QuantityAndAccount33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount33> forQuantityAndAccount33 = new MMConstraint<QuantityAndAccount33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount33.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount33 obj) throws Exception {
			checkQuantityAndAccount33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14
	 * QuantityAndAccount14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount14> forQuantityAndAccount14 = new MMConstraint<QuantityAndAccount14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount14.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount14 obj) throws Exception {
			checkQuantityAndAccount14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66
	 * QuantityAndAccount66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount44
	 * ConstraintDenominationRule.forQuantityAndAccount44}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount66> forQuantityAndAccount66 = new MMConstraint<QuantityAndAccount66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount44;
			owner_lazy = () -> QuantityAndAccount66.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount66 obj) throws Exception {
			checkQuantityAndAccount66(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65
	 * QuantityAndAccount65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount39
	 * ConstraintDenominationRule.forQuantityAndAccount39}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount65> forQuantityAndAccount65 = new MMConstraint<QuantityAndAccount65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount39;
			owner_lazy = () -> QuantityAndAccount65.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount65 obj) throws Exception {
			checkQuantityAndAccount65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30
	 * QuantityAndAccount30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount43
	 * ConstraintDenominationRule.forQuantityAndAccount43}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount30> forQuantityAndAccount30 = new MMConstraint<QuantityAndAccount30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount43);
			owner_lazy = () -> QuantityAndAccount30.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount30 obj) throws Exception {
			checkQuantityAndAccount30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68
	 * QuantityAndAccount68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount43
	 * ConstraintDenominationRule.forQuantityAndAccount43}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount68> forQuantityAndAccount68 = new MMConstraint<QuantityAndAccount68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount43;
			owner_lazy = () -> QuantityAndAccount68.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount68 obj) throws Exception {
			checkQuantityAndAccount68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12
	 * QuantityAndAccount12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount12> forQuantityAndAccount12 = new MMConstraint<QuantityAndAccount12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount12.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount12 obj) throws Exception {
			checkQuantityAndAccount12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5
	 * QuantityAndAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount5> forQuantityAndAccount5 = new MMConstraint<QuantityAndAccount5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount5.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount5 obj) throws Exception {
			checkQuantityAndAccount5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount69
	 * QuantityAndAccount69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount69> forQuantityAndAccount69 = new MMConstraint<QuantityAndAccount69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount69.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount69 obj) throws Exception {
			checkQuantityAndAccount69(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17
	 * QuantityAndAccount17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount17> forQuantityAndAccount17 = new MMConstraint<QuantityAndAccount17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount17.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount17 obj) throws Exception {
			checkQuantityAndAccount17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32
	 * QuantityAndAccount32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount32> forQuantityAndAccount32 = new MMConstraint<QuantityAndAccount32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount32.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount32 obj) throws Exception {
			checkQuantityAndAccount32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42
	 * QuantityAndAccount42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount63
	 * ConstraintDenominationRule.forQuantityAndAccount63}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount27
	 * ConstraintDenominationRule.forQuantityAndAccount27}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount42> forQuantityAndAccount42 = new MMConstraint<QuantityAndAccount42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount63);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount27;
			owner_lazy = () -> QuantityAndAccount42.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount42 obj) throws Exception {
			checkQuantityAndAccount42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28
	 * QuantityAndAccount28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount41
	 * ConstraintDenominationRule.forQuantityAndAccount41}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount28> forQuantityAndAccount28 = new MMConstraint<QuantityAndAccount28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount41);
			owner_lazy = () -> QuantityAndAccount28.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount28 obj) throws Exception {
			checkQuantityAndAccount28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3
	 * QuantityAndAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount3> forQuantityAndAccount3 = new MMConstraint<QuantityAndAccount3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount3.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount3 obj) throws Exception {
			checkQuantityAndAccount3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount71
	 * QuantityAndAccount71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount71> forQuantityAndAccount71 = new MMConstraint<QuantityAndAccount71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount71.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount71 obj) throws Exception {
			checkQuantityAndAccount71(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47
	 * QuantityAndAccount47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount56
	 * ConstraintDenominationRule.forQuantityAndAccount56}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount47> forQuantityAndAccount47 = new MMConstraint<QuantityAndAccount47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount56);
			owner_lazy = () -> QuantityAndAccount47.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount47 obj) throws Exception {
			checkQuantityAndAccount47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount59
	 * QuantityAndAccount59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount54
	 * ConstraintDenominationRule.forQuantityAndAccount54}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount59> forQuantityAndAccount59 = new MMConstraint<QuantityAndAccount59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount54;
			owner_lazy = () -> QuantityAndAccount59.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount59 obj) throws Exception {
			checkQuantityAndAccount59(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4
	 * QuantityAndAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount4> forQuantityAndAccount4 = new MMConstraint<QuantityAndAccount4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount4.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount4 obj) throws Exception {
			checkQuantityAndAccount4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58
	 * QuantityAndAccount58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount49
	 * ConstraintDenominationRule.forQuantityAndAccount49}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount58> forQuantityAndAccount58 = new MMConstraint<QuantityAndAccount58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount49;
			owner_lazy = () -> QuantityAndAccount58.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount58 obj) throws Exception {
			checkQuantityAndAccount58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount64
	 * ConstraintDenominationRule.forQuantityAndAccount64}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount28
	 * ConstraintDenominationRule.forQuantityAndAccount28}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount41> forQuantityAndAccount41 = new MMConstraint<QuantityAndAccount41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount64);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount28;
			owner_lazy = () -> QuantityAndAccount41.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount41 obj) throws Exception {
			checkQuantityAndAccount41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22
	 * QuantityAndAccount22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount22> forQuantityAndAccount22 = new MMConstraint<QuantityAndAccount22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount22.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount22 obj) throws Exception {
			checkQuantityAndAccount22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44
	 * QuantityAndAccount44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount66
	 * ConstraintDenominationRule.forQuantityAndAccount66}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount29
	 * ConstraintDenominationRule.forQuantityAndAccount29}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount44> forQuantityAndAccount44 = new MMConstraint<QuantityAndAccount44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount66);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount29;
			owner_lazy = () -> QuantityAndAccount44.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount44 obj) throws Exception {
			checkQuantityAndAccount44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39
	 * QuantityAndAccount39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount65
	 * ConstraintDenominationRule.forQuantityAndAccount65}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount25
	 * ConstraintDenominationRule.forQuantityAndAccount25}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount39> forQuantityAndAccount39 = new MMConstraint<QuantityAndAccount39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount25;
			owner_lazy = () -> QuantityAndAccount39.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount39 obj) throws Exception {
			checkQuantityAndAccount39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount67
	 * QuantityAndAccount67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount45
	 * ConstraintDenominationRule.forQuantityAndAccount45}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount67> forQuantityAndAccount67 = new MMConstraint<QuantityAndAccount67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount45;
			owner_lazy = () -> QuantityAndAccount67.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount67 obj) throws Exception {
			checkQuantityAndAccount67(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49
	 * QuantityAndAccount49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount58
	 * ConstraintDenominationRule.forQuantityAndAccount58}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount49> forQuantityAndAccount49 = new MMConstraint<QuantityAndAccount49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount58);
			owner_lazy = () -> QuantityAndAccount49.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount49 obj) throws Exception {
			checkQuantityAndAccount49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45
	 * QuantityAndAccount45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount67
	 * ConstraintDenominationRule.forQuantityAndAccount67}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount26
	 * ConstraintDenominationRule.forQuantityAndAccount26}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount45> forQuantityAndAccount45 = new MMConstraint<QuantityAndAccount45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount26;
			owner_lazy = () -> QuantityAndAccount45.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount45 obj) throws Exception {
			checkQuantityAndAccount45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount70
	 * QuantityAndAccount70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount70> forQuantityAndAccount70 = new MMConstraint<QuantityAndAccount70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount70.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount70 obj) throws Exception {
			checkQuantityAndAccount70(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60
	 * QuantityAndAccount60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount55
	 * ConstraintDenominationRule.forQuantityAndAccount55}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount60> forQuantityAndAccount60 = new MMConstraint<QuantityAndAccount60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount55;
			owner_lazy = () -> QuantityAndAccount60.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount60 obj) throws Exception {
			checkQuantityAndAccount60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25
	 * QuantityAndAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount39
	 * ConstraintDenominationRule.forQuantityAndAccount39}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount25> forQuantityAndAccount25 = new MMConstraint<QuantityAndAccount25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount39);
			owner_lazy = () -> QuantityAndAccount25.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount25 obj) throws Exception {
			checkQuantityAndAccount25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34
	 * QuantityAndAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount34> forQuantityAndAccount34 = new MMConstraint<QuantityAndAccount34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount34.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount34 obj) throws Exception {
			checkQuantityAndAccount34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15
	 * QuantityAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount15> forQuantityAndAccount15 = new MMConstraint<QuantityAndAccount15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount15.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount15 obj) throws Exception {
			checkQuantityAndAccount15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43
	 * QuantityAndAccount43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount68
	 * ConstraintDenominationRule.forQuantityAndAccount68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount30
	 * ConstraintDenominationRule.forQuantityAndAccount30}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount43> forQuantityAndAccount43 = new MMConstraint<QuantityAndAccount43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount30;
			owner_lazy = () -> QuantityAndAccount43.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount43 obj) throws Exception {
			checkQuantityAndAccount43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8
	 * QuantityAndAccount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount8> forQuantityAndAccount8 = new MMConstraint<QuantityAndAccount8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount8.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount8 obj) throws Exception {
			checkQuantityAndAccount8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount75
	 * QuantityAndAccount75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount75> forQuantityAndAccount75 = new MMConstraint<QuantityAndAccount75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount75.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount75 obj) throws Exception {
			checkQuantityAndAccount75(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1
	 * QuantityAndAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount1> forQuantityAndAccount1 = new MMConstraint<QuantityAndAccount1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount1.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount1 obj) throws Exception {
			checkQuantityAndAccount1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63
	 * QuantityAndAccount63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount42
	 * ConstraintDenominationRule.forQuantityAndAccount42}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount63> forQuantityAndAccount63 = new MMConstraint<QuantityAndAccount63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount42;
			owner_lazy = () -> QuantityAndAccount63.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount63 obj) throws Exception {
			checkQuantityAndAccount63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57
	 * QuantityAndAccount57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount51
	 * ConstraintDenominationRule.forQuantityAndAccount51}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount57> forQuantityAndAccount57 = new MMConstraint<QuantityAndAccount57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount51;
			owner_lazy = () -> QuantityAndAccount57.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount57 obj) throws Exception {
			checkQuantityAndAccount57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13
	 * QuantityAndAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount13> forQuantityAndAccount13 = new MMConstraint<QuantityAndAccount13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount13.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount13 obj) throws Exception {
			checkQuantityAndAccount13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56
	 * QuantityAndAccount56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount47
	 * ConstraintDenominationRule.forQuantityAndAccount47}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount56> forQuantityAndAccount56 = new MMConstraint<QuantityAndAccount56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount47;
			owner_lazy = () -> QuantityAndAccount56.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount56 obj) throws Exception {
			checkQuantityAndAccount56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27
	 * QuantityAndAccount27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount42
	 * ConstraintDenominationRule.forQuantityAndAccount42}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount27> forQuantityAndAccount27 = new MMConstraint<QuantityAndAccount27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount42);
			owner_lazy = () -> QuantityAndAccount27.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount27 obj) throws Exception {
			checkQuantityAndAccount27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35
	 * QuantityAndAccount35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount35> forQuantityAndAccount35 = new MMConstraint<QuantityAndAccount35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount35.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount35 obj) throws Exception {
			checkQuantityAndAccount35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50
	 * QuantityAndAccount50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount50> forQuantityAndAccount50 = new MMConstraint<QuantityAndAccount50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount50.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount50 obj) throws Exception {
			checkQuantityAndAccount50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9
	 * QuantityAndAccount9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount9> forQuantityAndAccount9 = new MMConstraint<QuantityAndAccount9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount9.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount9 obj) throws Exception {
			checkQuantityAndAccount9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64
	 * QuantityAndAccount64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount41
	 * ConstraintDenominationRule.forQuantityAndAccount41}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount64> forQuantityAndAccount64 = new MMConstraint<QuantityAndAccount64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount41;
			owner_lazy = () -> QuantityAndAccount64.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount64 obj) throws Exception {
			checkQuantityAndAccount64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount76
	 * QuantityAndAccount76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount76> forQuantityAndAccount76 = new MMConstraint<QuantityAndAccount76>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount76.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount76 obj) throws Exception {
			checkQuantityAndAccount76(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20
	 * QuantityAndAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount20> forQuantityAndAccount20 = new MMConstraint<QuantityAndAccount20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount20.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount20 obj) throws Exception {
			checkQuantityAndAccount20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24
	 * QuantityAndAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount24> forQuantityAndAccount24 = new MMConstraint<QuantityAndAccount24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount24.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount24 obj) throws Exception {
			checkQuantityAndAccount24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36
	 * QuantityAndAccount36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount36> forQuantityAndAccount36 = new MMConstraint<QuantityAndAccount36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount36.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount36 obj) throws Exception {
			checkQuantityAndAccount36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26
	 * QuantityAndAccount26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount45
	 * ConstraintDenominationRule.forQuantityAndAccount45}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount26> forQuantityAndAccount26 = new MMConstraint<QuantityAndAccount26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount45);
			owner_lazy = () -> QuantityAndAccount26.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount26 obj) throws Exception {
			checkQuantityAndAccount26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2
	 * QuantityAndAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount2> forQuantityAndAccount2 = new MMConstraint<QuantityAndAccount2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount2.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount2 obj) throws Exception {
			checkQuantityAndAccount2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37
	 * QuantityAndAccount37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount37> forQuantityAndAccount37 = new MMConstraint<QuantityAndAccount37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount37.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount37 obj) throws Exception {
			checkQuantityAndAccount37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount54
	 * QuantityAndAccount54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount59
	 * ConstraintDenominationRule.forQuantityAndAccount59}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount54> forQuantityAndAccount54 = new MMConstraint<QuantityAndAccount54>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount59);
			owner_lazy = () -> QuantityAndAccount54.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount54 obj) throws Exception {
			checkQuantityAndAccount54(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29
	 * QuantityAndAccount29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount44
	 * ConstraintDenominationRule.forQuantityAndAccount44}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount29> forQuantityAndAccount29 = new MMConstraint<QuantityAndAccount29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount44);
			owner_lazy = () -> QuantityAndAccount29.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount29 obj) throws Exception {
			checkQuantityAndAccount29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23
	 * QuantityAndAccount23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount23> forQuantityAndAccount23 = new MMConstraint<QuantityAndAccount23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount23.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount23 obj) throws Exception {
			checkQuantityAndAccount23(obj);
		}
	};

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount51(QuantityAndAccount51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount55(QuantityAndAccount55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount72(QuantityAndAccount72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount33(QuantityAndAccount33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount14(QuantityAndAccount14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount66(QuantityAndAccount66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount65(QuantityAndAccount65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount30(QuantityAndAccount30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount68(QuantityAndAccount68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount12(QuantityAndAccount12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount5(QuantityAndAccount5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount69(QuantityAndAccount69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount17(QuantityAndAccount17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount32(QuantityAndAccount32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount42(QuantityAndAccount42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount28(QuantityAndAccount28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount3(QuantityAndAccount3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount71(QuantityAndAccount71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount47(QuantityAndAccount47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount59(QuantityAndAccount59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount4(QuantityAndAccount4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount58(QuantityAndAccount58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount41(QuantityAndAccount41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount22(QuantityAndAccount22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount44(QuantityAndAccount44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount39(QuantityAndAccount39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount67(QuantityAndAccount67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount49(QuantityAndAccount49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount45(QuantityAndAccount45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount70(QuantityAndAccount70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount60(QuantityAndAccount60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount25(QuantityAndAccount25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount34(QuantityAndAccount34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount15(QuantityAndAccount15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount43(QuantityAndAccount43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount8(QuantityAndAccount8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount75(QuantityAndAccount75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount1(QuantityAndAccount1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount63(QuantityAndAccount63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount57(QuantityAndAccount57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount13(QuantityAndAccount13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount56(QuantityAndAccount56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount27(QuantityAndAccount27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount35(QuantityAndAccount35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount50(QuantityAndAccount50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount9(QuantityAndAccount9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount64(QuantityAndAccount64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount76(QuantityAndAccount76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount20(QuantityAndAccount20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount24(QuantityAndAccount24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount36(QuantityAndAccount36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount26(QuantityAndAccount26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount2(QuantityAndAccount2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount37(QuantityAndAccount37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount54(QuantityAndAccount54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount29(QuantityAndAccount29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount23(QuantityAndAccount23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}