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
 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.
 */
public class ConstraintIntermediaryAgent3Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation1> forCreditTransferTransactionInformation1 = new MMConstraint<CreditTransferTransactionInformation1>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransactionInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10
	 * CreditTransferTransactionInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation10> forCreditTransferTransactionInformation10 = new MMConstraint<CreditTransferTransactionInformation10>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransactionInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation10.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1
	 * CreditTransferTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction1> forCreditTransferTransaction1 = new MMConstraint<CreditTransferTransaction1>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransaction1.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6
	 * CreditTransferTransaction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction20
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction20}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction6> forCreditTransferTransaction6 = new MMConstraint<CreditTransferTransaction6>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction20);
			owner_lazy = () -> CreditTransferTransaction6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2
	 * CreditTransferTransactionInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation2> forCreditTransferTransactionInformation2 = new MMConstraint<CreditTransferTransactionInformation2>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransactionInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11
	 * CreditTransferTransactionInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation11> forCreditTransferTransactionInformation11 = new MMConstraint<CreditTransferTransactionInformation11>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransactionInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation11.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2
	 * CreditTransferTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction2> forCreditTransferTransaction2 = new MMConstraint<CreditTransferTransaction2>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransaction2.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7
	 * CreditTransferTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction19
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction19}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction7> forCreditTransferTransaction7 = new MMConstraint<CreditTransferTransaction7>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction19);
			owner_lazy = () -> CreditTransferTransaction7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2
	 * DirectDebitTransactionInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation2> forDirectDebitTransactionInformation2 = new MMConstraint<DirectDebitTransactionInformation2>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkDirectDebitTransactionInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> DirectDebitTransactionInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10
	 * DirectDebitTransactionInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation10> forDirectDebitTransactionInformation10 = new MMConstraint<DirectDebitTransactionInformation10>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkDirectDebitTransactionInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> DirectDebitTransactionInformation10.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12
	 * DirectDebitTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation12> forDirectDebitTransactionInformation12 = new MMConstraint<DirectDebitTransactionInformation12>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkDirectDebitTransactionInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> DirectDebitTransactionInformation12.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14
	 * DirectDebitTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forDirectDebitTransactionInformation17
	 * ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation14> forDirectDebitTransactionInformation14 = new MMConstraint<DirectDebitTransactionInformation14>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkDirectDebitTransactionInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation17);
			owner_lazy = () -> DirectDebitTransactionInformation14.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3
	 * CreditTransferTransactionInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation3> forCreditTransferTransactionInformation3 = new MMConstraint<CreditTransferTransactionInformation3>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransactionInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation12> forCreditTransferTransactionInformation12 = new MMConstraint<CreditTransferTransactionInformation12>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransactionInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation12.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13
	 * CreditTransferTransactionInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation13> forCreditTransferTransactionInformation13 = new MMConstraint<CreditTransferTransactionInformation13>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransactionInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation13.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction3
	 * CreditTransferTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction18
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction18}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction3> forCreditTransferTransaction3 = new MMConstraint<CreditTransferTransaction3>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction18);
			owner_lazy = () -> CreditTransferTransaction3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4
	 * CreditTransferTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction4> forCreditTransferTransaction4 = new MMConstraint<CreditTransferTransaction4>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransaction4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8
	 * CreditTransferTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction17
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction8> forCreditTransferTransaction8 = new MMConstraint<CreditTransferTransaction8>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction17);
			owner_lazy = () -> CreditTransferTransaction8.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation14> forCreditTransferTransactionInformation14 = new MMConstraint<CreditTransferTransactionInformation14>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransactionInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation14.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5
	 * CreditTransferTransaction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction5> forCreditTransferTransaction5 = new MMConstraint<CreditTransferTransaction5>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransaction5.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction21
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction21}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction10> forCreditTransferTransaction10 = new MMConstraint<CreditTransferTransaction10>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction21);
			owner_lazy = () -> CreditTransferTransaction10.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2
	 * PaymentComplementaryInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation2> forPaymentComplementaryInformation2 = new MMConstraint<PaymentComplementaryInformation2>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkPaymentComplementaryInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> PaymentComplementaryInformation2.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3
	 * PaymentComplementaryInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forPaymentComplementaryInformation4
	 * ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation3> forPaymentComplementaryInformation3 = new MMConstraint<PaymentComplementaryInformation3>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkPaymentComplementaryInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation4);
			owner_lazy = () -> PaymentComplementaryInformation3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9
	 * CreditTransferTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction9> forCreditTransferTransaction9 = new MMConstraint<CreditTransferTransaction9>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransaction9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7
	 * CreditTransferTransactionInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule:\nIf IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation7> forCreditTransferTransactionInformation7 = new MMConstraint<CreditTransferTransactionInformation7>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransactionInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "ISO20022 Rule:\nIf IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule:\nIf IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation9> forCreditTransferTransactionInformation9 = new MMConstraint<CreditTransferTransactionInformation9>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransactionInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "ISO20022 Rule:\nIf IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			owner_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4
	 * PaymentComplementaryInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forPaymentComplementaryInformation5
	 * ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation5}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forPaymentComplementaryInformation3
	 * ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation3}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation4> forPaymentComplementaryInformation4 = new MMConstraint<PaymentComplementaryInformation4>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkPaymentComplementaryInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation5);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation3;
			owner_lazy = () -> PaymentComplementaryInformation4.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17
	 * CreditTransferTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction23
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction8
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction8}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction17> forCreditTransferTransaction17 = new MMConstraint<CreditTransferTransaction17>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction8;
			owner_lazy = () -> CreditTransferTransaction17.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19
	 * CreditTransferTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction25
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction25}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction7
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction7}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction19> forCreditTransferTransaction19 = new MMConstraint<CreditTransferTransaction19>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction25);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction7;
			owner_lazy = () -> CreditTransferTransaction19.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17
	 * DirectDebitTransactionInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forDirectDebitTransactionInformation20
	 * ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation20}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forDirectDebitTransactionInformation14
	 * ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation14}</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation17> forDirectDebitTransactionInformation17 = new MMConstraint<DirectDebitTransactionInformation17>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkDirectDebitTransactionInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation20);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation14;
			owner_lazy = () -> DirectDebitTransactionInformation17.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18
	 * CreditTransferTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction24
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction3
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction3}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction18> forCreditTransferTransaction18 = new MMConstraint<CreditTransferTransaction18>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction3;
			owner_lazy = () -> CreditTransferTransaction18.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20
	 * CreditTransferTransaction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction26
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction26}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction6
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction6}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction20> forCreditTransferTransaction20 = new MMConstraint<CreditTransferTransaction20>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction6;
			owner_lazy = () -> CreditTransferTransaction20.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21
	 * CreditTransferTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction22
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction10
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction10}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction21> forCreditTransferTransaction21 = new MMConstraint<CreditTransferTransaction21>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction10;
			owner_lazy = () -> CreditTransferTransaction21.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23
	 * CreditTransferTransaction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction17
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction23> forCreditTransferTransaction23 = new MMConstraint<CreditTransferTransaction23>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction17;
			owner_lazy = () -> CreditTransferTransaction23.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25
	 * CreditTransferTransaction25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction19
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction25> forCreditTransferTransaction25 = new MMConstraint<CreditTransferTransaction25>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction19;
			owner_lazy = () -> CreditTransferTransaction25.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5
	 * PaymentComplementaryInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forPaymentComplementaryInformation6
	 * ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation6}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forPaymentComplementaryInformation4
	 * ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation4}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation5> forPaymentComplementaryInformation5 = new MMConstraint<PaymentComplementaryInformation5>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkPaymentComplementaryInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation6);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation4;
			owner_lazy = () -> PaymentComplementaryInformation5.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20
	 * DirectDebitTransactionInformation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forDirectDebitTransactionInformation21
	 * ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation21}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forDirectDebitTransactionInformation17
	 * ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation17}</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation20> forDirectDebitTransactionInformation20 = new MMConstraint<DirectDebitTransactionInformation20>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkDirectDebitTransactionInformation20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation21);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation17;
			owner_lazy = () -> DirectDebitTransactionInformation20.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24
	 * CreditTransferTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction18
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction18}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction24> forCreditTransferTransaction24 = new MMConstraint<CreditTransferTransaction24>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction18;
			owner_lazy = () -> CreditTransferTransaction24.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26
	 * CreditTransferTransaction26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction20
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction20}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction26> forCreditTransferTransaction26 = new MMConstraint<CreditTransferTransaction26>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction20;
			owner_lazy = () -> CreditTransferTransaction26.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22
	 * CreditTransferTransaction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction21
	 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction21}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction22> forCreditTransferTransaction22 = new MMConstraint<CreditTransferTransaction22>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkCreditTransferTransaction22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction21;
			owner_lazy = () -> CreditTransferTransaction22.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21
	 * DirectDebitTransactionInformation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forDirectDebitTransactionInformation20
	 * ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation20}</li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation21> forDirectDebitTransactionInformation21 = new MMConstraint<DirectDebitTransactionInformation21>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkDirectDebitTransactionInformation21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forDirectDebitTransactionInformation20;
			owner_lazy = () -> DirectDebitTransactionInformation21.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6
	 * PaymentComplementaryInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent2&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/IntermediaryAgent3&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forPaymentComplementaryInformation5
	 * ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation5}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation6> forPaymentComplementaryInformation6 = new MMConstraint<PaymentComplementaryInformation6>() {
		{
			validator = ConstraintIntermediaryAgent3Rule::checkPaymentComplementaryInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Rule";
			definition = "If IntermediaryAgent3 is present, then IntermediaryAgent2 must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forPaymentComplementaryInformation5;
			owner_lazy = () -> PaymentComplementaryInformation6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent2</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/IntermediaryAgent3</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransactionInformation1(CreditTransferTransactionInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransactionInformation10(CreditTransferTransactionInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction1(CreditTransferTransaction1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction6(CreditTransferTransaction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransactionInformation2(CreditTransferTransactionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransactionInformation11(CreditTransferTransactionInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction2(CreditTransferTransaction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction7(CreditTransferTransaction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkDirectDebitTransactionInformation2(DirectDebitTransactionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkDirectDebitTransactionInformation10(DirectDebitTransactionInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkDirectDebitTransactionInformation12(DirectDebitTransactionInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkDirectDebitTransactionInformation14(DirectDebitTransactionInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransactionInformation3(CreditTransferTransactionInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransactionInformation12(CreditTransferTransactionInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransactionInformation13(CreditTransferTransactionInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction3(CreditTransferTransaction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction4(CreditTransferTransaction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction8(CreditTransferTransaction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransactionInformation14(CreditTransferTransactionInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction5(CreditTransferTransaction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction10(CreditTransferTransaction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkPaymentComplementaryInformation2(PaymentComplementaryInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkPaymentComplementaryInformation3(PaymentComplementaryInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction9(CreditTransferTransaction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: If IntermediaryAgent3 is present, then IntermediaryAgent2
	 * must be present.
	 */
	public static void checkCreditTransferTransactionInformation7(CreditTransferTransactionInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: If IntermediaryAgent3 is present, then IntermediaryAgent2
	 * must be present.
	 */
	public static void checkCreditTransferTransactionInformation9(CreditTransferTransactionInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkPaymentComplementaryInformation4(PaymentComplementaryInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction17(CreditTransferTransaction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction19(CreditTransferTransaction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkDirectDebitTransactionInformation17(DirectDebitTransactionInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction18(CreditTransferTransaction18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction20(CreditTransferTransaction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction21(CreditTransferTransaction21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction23(CreditTransferTransaction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction25(CreditTransferTransaction25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkPaymentComplementaryInformation5(PaymentComplementaryInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkDirectDebitTransactionInformation20(DirectDebitTransactionInformation20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction24(CreditTransferTransaction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction26(CreditTransferTransaction26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkCreditTransferTransaction22(CreditTransferTransaction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkDirectDebitTransactionInformation21(DirectDebitTransactionInformation21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If IntermediaryAgent3 is present, then IntermediaryAgent2 must be
	 * present.
	 */
	public static void checkPaymentComplementaryInformation6(PaymentComplementaryInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}