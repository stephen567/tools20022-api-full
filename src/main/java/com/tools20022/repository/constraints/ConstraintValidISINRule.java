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
import com.tools20022.repository.choice.FinancialInstrument46Choice;
import com.tools20022.repository.choice.InflationIndex1Choice;
import com.tools20022.repository.msg.*;

/**
 * ISIN code must pass checksum validation.
 */
public class ConstraintValidISINRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InflationIndex1Choice
	 * InflationIndex1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<InflationIndex1Choice> forInflationIndex1Choice = new MMConstraint<InflationIndex1Choice>() {
		{
			validator = ConstraintValidISINRule::checkInflationIndex1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> InflationIndex1Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
	 * SecurityInstrumentDescription9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<SecurityInstrumentDescription9> forSecurityInstrumentDescription9 = new MMConstraint<SecurityInstrumentDescription9>() {
		{
			validator = ConstraintValidISINRule::checkSecurityInstrumentDescription9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> SecurityInstrumentDescription9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2
	 * VolumeCapReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<VolumeCapReport2> forVolumeCapReport2 = new MMConstraint<VolumeCapReport2>() {
		{
			validator = ConstraintValidISINRule::checkVolumeCapReport2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> VolumeCapReport2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument46Choice
	 * FinancialInstrument46Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument46Choice> forFinancialInstrument46Choice = new MMConstraint<FinancialInstrument46Choice>() {
		{
			validator = ConstraintValidISINRule::checkFinancialInstrument46Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> FinancialInstrument46Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport11> forTransparencyDataReport11 = new MMConstraint<TransparencyDataReport11>() {
		{
			validator = ConstraintValidISINRule::checkTransparencyDataReport11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> TransparencyDataReport11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport13> forTransparencyDataReport13 = new MMConstraint<TransparencyDataReport13>() {
		{
			validator = ConstraintValidISINRule::checkTransparencyDataReport13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> TransparencyDataReport13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport12> forTransparencyDataReport12 = new MMConstraint<TransparencyDataReport12>() {
		{
			validator = ConstraintValidISINRule::checkTransparencyDataReport12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> TransparencyDataReport12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15
	 * TransparencyDataReport15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport15> forTransparencyDataReport15 = new MMConstraint<TransparencyDataReport15>() {
		{
			validator = ConstraintValidISINRule::checkTransparencyDataReport15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> TransparencyDataReport15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport10> forTransparencyDataReport10 = new MMConstraint<TransparencyDataReport10>() {
		{
			validator = ConstraintValidISINRule::checkTransparencyDataReport10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> TransparencyDataReport10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport14> forTransparencyDataReport14 = new MMConstraint<TransparencyDataReport14>() {
		{
			validator = ConstraintValidISINRule::checkTransparencyDataReport14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> TransparencyDataReport14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4
	 * CreditDefaultSwapDerivative4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidISINRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISIN code must pass checksum validation."</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditDefaultSwapDerivative4> forCreditDefaultSwapDerivative4 = new MMConstraint<CreditDefaultSwapDerivative4>() {
		{
			validator = ConstraintValidISINRule::checkCreditDefaultSwapDerivative4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidISINRule";
			definition = "ISIN code must pass checksum validation.";
			owner_lazy = () -> CreditDefaultSwapDerivative4.mmObject();
		}
	};

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkInflationIndex1Choice(InflationIndex1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkSecurityInstrumentDescription9(SecurityInstrumentDescription9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkVolumeCapReport2(VolumeCapReport2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkFinancialInstrument46Choice(FinancialInstrument46Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkTransparencyDataReport11(TransparencyDataReport11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkTransparencyDataReport13(TransparencyDataReport13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkTransparencyDataReport12(TransparencyDataReport12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkTransparencyDataReport15(TransparencyDataReport15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkTransparencyDataReport10(TransparencyDataReport10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkTransparencyDataReport14(TransparencyDataReport14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISIN code must pass checksum validation.
	 */
	public static void checkCreditDefaultSwapDerivative4(CreditDefaultSwapDerivative4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}