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
 * If PaymentCommonInformation/CreditDebitIndicator is present, then
 * TransactionReport/Transaction/CreditDebitIndicator is not allowed. If
 * PaymentCommonInformation/CreditDebitIndicator is not present, then
 * TransactionReport/Transaction/CreditDebitIndicator is optional.
 */
public class ConstraintCreditDebitIndicator1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions2 Transactions2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/CreditDebitIndicator is present, then TransactionReport/Transaction/CreditDebitIndicator  is not allowed.\nIf PaymentCommonInformation/CreditDebitIndicator is not present, then TransactionReport/Transaction/CreditDebitIndicator  is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions2> forTransactions2 = new MMConstraint<Transactions2>() {
		{
			validator = ConstraintCreditDebitIndicator1Rule::checkTransactions2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator1Rule";
			definition = "If PaymentCommonInformation/CreditDebitIndicator is present, then TransactionReport/Transaction/CreditDebitIndicator  is not allowed.\nIf PaymentCommonInformation/CreditDebitIndicator is not present, then TransactionReport/Transaction/CreditDebitIndicator  is optional.";
			owner_lazy = () -> Transactions2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions3 Transactions3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/CreditDebitIndicator is present, then TransactionReport/Transaction/CreditDebitIndicator  is not allowed.\nIf PaymentCommonInformation/CreditDebitIndicator is not present, then TransactionReport/Transaction/CreditDebitIndicator  is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions3> forTransactions3 = new MMConstraint<Transactions3>() {
		{
			validator = ConstraintCreditDebitIndicator1Rule::checkTransactions3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator1Rule";
			definition = "If PaymentCommonInformation/CreditDebitIndicator is present, then TransactionReport/Transaction/CreditDebitIndicator  is not allowed.\nIf PaymentCommonInformation/CreditDebitIndicator is not present, then TransactionReport/Transaction/CreditDebitIndicator  is optional.";
			owner_lazy = () -> Transactions3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions4 Transactions4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/CreditDebitIndicator is present, then TransactionReport/Transaction/CreditDebitIndicator  is not allowed.\nIf PaymentCommonInformation/CreditDebitIndicator is not present, then TransactionReport/Transaction/CreditDebitIndicator  is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions4> forTransactions4 = new MMConstraint<Transactions4>() {
		{
			validator = ConstraintCreditDebitIndicator1Rule::checkTransactions4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator1Rule";
			definition = "If PaymentCommonInformation/CreditDebitIndicator is present, then TransactionReport/Transaction/CreditDebitIndicator  is not allowed.\nIf PaymentCommonInformation/CreditDebitIndicator is not present, then TransactionReport/Transaction/CreditDebitIndicator  is optional.";
			owner_lazy = () -> Transactions4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions5 Transactions5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionReport[*]/TransactionOrError/Transaction/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentCommonInformation/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/CreditDebitIndicator is present, then TransactionReport/Transaction/CreditDebitIndicator is not allowed.\r\nIf PaymentCommonInformation/CreditDebitIndicator is not present, then TransactionReport/Transaction/CreditDebitIndicator  is optional."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicator1Rule#forTransactions6
	 * ConstraintCreditDebitIndicator1Rule.forTransactions6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions5> forTransactions5 = new MMConstraint<Transactions5>() {
		{
			validator = ConstraintCreditDebitIndicator1Rule::checkTransactions5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator1Rule";
			definition = "If PaymentCommonInformation/CreditDebitIndicator is present, then TransactionReport/Transaction/CreditDebitIndicator is not allowed.\r\nIf PaymentCommonInformation/CreditDebitIndicator is not present, then TransactionReport/Transaction/CreditDebitIndicator  is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditDebitIndicator1Rule.forTransactions6);
			owner_lazy = () -> Transactions5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionReport[*]/TransactionOrError/Transaction/CreditDebitIndicator</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentCommonInformation/CreditDebitIndicator</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions6 Transactions6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionReport[*]/TransactionOrError/Transaction/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentCommonInformation/CreditDebitIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/CreditDebitIndicator is present, then TransactionReport/Transaction/CreditDebitIndicator is not allowed.\r\nIf PaymentCommonInformation/CreditDebitIndicator is not present, then TransactionReport/Transaction/CreditDebitIndicator  is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicator1Rule#forTransactions5
	 * ConstraintCreditDebitIndicator1Rule.forTransactions5}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions6> forTransactions6 = new MMConstraint<Transactions6>() {
		{
			validator = ConstraintCreditDebitIndicator1Rule::checkTransactions6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator1Rule";
			definition = "If PaymentCommonInformation/CreditDebitIndicator is present, then TransactionReport/Transaction/CreditDebitIndicator is not allowed.\r\nIf PaymentCommonInformation/CreditDebitIndicator is not present, then TransactionReport/Transaction/CreditDebitIndicator  is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCreditDebitIndicator1Rule.forTransactions5;
			owner_lazy = () -> Transactions6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionReport[*]/TransactionOrError/Transaction/CreditDebitIndicator</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentCommonInformation/CreditDebitIndicator</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If PaymentCommonInformation/CreditDebitIndicator is present, then
	 * TransactionReport/Transaction/CreditDebitIndicator is not allowed. If
	 * PaymentCommonInformation/CreditDebitIndicator is not present, then
	 * TransactionReport/Transaction/CreditDebitIndicator is optional.
	 */
	public static void checkTransactions2(Transactions2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/CreditDebitIndicator is present, then
	 * TransactionReport/Transaction/CreditDebitIndicator is not allowed. If
	 * PaymentCommonInformation/CreditDebitIndicator is not present, then
	 * TransactionReport/Transaction/CreditDebitIndicator is optional.
	 */
	public static void checkTransactions3(Transactions3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/CreditDebitIndicator is present, then
	 * TransactionReport/Transaction/CreditDebitIndicator is not allowed. If
	 * PaymentCommonInformation/CreditDebitIndicator is not present, then
	 * TransactionReport/Transaction/CreditDebitIndicator is optional.
	 */
	public static void checkTransactions4(Transactions4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/CreditDebitIndicator is present, then
	 * TransactionReport/Transaction/CreditDebitIndicator is not allowed.<br>
	 * If PaymentCommonInformation/CreditDebitIndicator is not present, then
	 * TransactionReport/Transaction/CreditDebitIndicator is optional.
	 */
	public static void checkTransactions5(Transactions5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/CreditDebitIndicator is present, then
	 * TransactionReport/Transaction/CreditDebitIndicator is not allowed.<br>
	 * If PaymentCommonInformation/CreditDebitIndicator is not present, then
	 * TransactionReport/Transaction/CreditDebitIndicator is optional.
	 */
	public static void checkTransactions6(Transactions6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}