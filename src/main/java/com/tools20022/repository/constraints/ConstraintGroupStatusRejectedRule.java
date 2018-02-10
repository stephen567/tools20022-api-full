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
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.area.pain.*;
import java.util.Arrays;

/**
 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to
 * RJCT (Rejected), then
 * OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present,
 * must be equal to RJCT (Rejected).
 */
public class ConstraintGroupStatusRejectedRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07
	 * CustomerPaymentStatusReportV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT (Rejected), then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT (Rejected)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forCustomerPaymentStatusReportV08
	 * ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forCustomerPaymentStatusReportV06
	 * ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV07> forCustomerPaymentStatusReportV07 = new MMConstraint<CustomerPaymentStatusReportV07>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkCustomerPaymentStatusReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT (Rejected), then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT (Rejected).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV06;
			owner_lazy = () -> CustomerPaymentStatusReportV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08
	 * CustomerPaymentStatusReportV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT (Rejected), then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT (Rejected)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forCustomerPaymentStatusReportV07
	 * ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV08> forCustomerPaymentStatusReportV08 = new MMConstraint<CustomerPaymentStatusReportV08>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkCustomerPaymentStatusReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT (Rejected), then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT (Rejected).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV07;
			owner_lazy = () -> CustomerPaymentStatusReportV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08
	 * FIToFIPaymentStatusReportV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus[*]/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus[*]/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT (Rejected), then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT (Rejected)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forFIToFIPaymentStatusReportV07
	 * ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV08> forFIToFIPaymentStatusReportV08 = new MMConstraint<FIToFIPaymentStatusReportV08>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkFIToFIPaymentStatusReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT (Rejected), then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT (Rejected).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV07;
			owner_lazy = () -> FIToFIPaymentStatusReportV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus[*]/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus[*]/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07
	 * FIToFIPaymentStatusReportV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus[*]/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus[*]/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT (Rejected), then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT (Rejected)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forFIToFIPaymentStatusReportV08
	 * ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forFIToFIPaymentStatusReportV06
	 * ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV07> forFIToFIPaymentStatusReportV07 = new MMConstraint<FIToFIPaymentStatusReportV07>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkFIToFIPaymentStatusReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT (Rejected), then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT (Rejected).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV06;
			owner_lazy = () -> FIToFIPaymentStatusReportV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus[*]/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus[*]/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV03
	 * CustomerPaymentStatusReportV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV03> forCustomerPaymentStatusReportV03 = new MMConstraint<CustomerPaymentStatusReportV03>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkCustomerPaymentStatusReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT.";
			owner_lazy = () -> CustomerPaymentStatusReportV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV04
	 * CustomerPaymentStatusReportV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV04> forCustomerPaymentStatusReportV04 = new MMConstraint<CustomerPaymentStatusReportV04>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkCustomerPaymentStatusReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT.";
			owner_lazy = () -> CustomerPaymentStatusReportV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV05
	 * CustomerPaymentStatusReportV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forCustomerPaymentStatusReportV06
	 * ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV05> forCustomerPaymentStatusReportV05 = new MMConstraint<CustomerPaymentStatusReportV05>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkCustomerPaymentStatusReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV06);
			owner_lazy = () -> CustomerPaymentStatusReportV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV06
	 * CustomerPaymentStatusReportV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forCustomerPaymentStatusReportV07
	 * ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forCustomerPaymentStatusReportV05
	 * ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV06> forCustomerPaymentStatusReportV06 = new MMConstraint<CustomerPaymentStatusReportV06>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkCustomerPaymentStatusReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present, must be equal to RJCT.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forCustomerPaymentStatusReportV05;
			owner_lazy = () -> CustomerPaymentStatusReportV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalPaymentInformationAndStatus[*]/PaymentInformationStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV03
	 * FIToFIPaymentStatusReportV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV03> forFIToFIPaymentStatusReportV03 = new MMConstraint<FIToFIPaymentStatusReportV03>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkFIToFIPaymentStatusReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT.";
			owner_lazy = () -> FIToFIPaymentStatusReportV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV04
	 * FIToFIPaymentStatusReportV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV04> forFIToFIPaymentStatusReportV04 = new MMConstraint<FIToFIPaymentStatusReportV04>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkFIToFIPaymentStatusReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT.";
			owner_lazy = () -> FIToFIPaymentStatusReportV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05
	 * FIToFIPaymentStatusReportV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forFIToFIPaymentStatusReportV06
	 * ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV05> forFIToFIPaymentStatusReportV05 = new MMConstraint<FIToFIPaymentStatusReportV05>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkFIToFIPaymentStatusReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV06);
			owner_lazy = () -> FIToFIPaymentStatusReportV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06
	 * FIToFIPaymentStatusReportV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"NotWithInList\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;PartialGroupStatus2Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus[*]/GroupStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OriginalGroupInformationAndStatus[*]/GroupStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatusRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forFIToFIPaymentStatusReportV07
	 * ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#forFIToFIPaymentStatusReportV05
	 * ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV06> forFIToFIPaymentStatusReportV06 = new MMConstraint<FIToFIPaymentStatusReportV06>() {
		{
			validator = ConstraintGroupStatusRejectedRule::checkFIToFIPaymentStatusReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatusRejectedRule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RJCT, then TransactionInformationAndStatus/TransactionStatus, if present, must be equal to RJCT.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.forFIToFIPaymentStatusReportV05;
			owner_lazy = () -> FIToFIPaymentStatusReportV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"NotWithInList\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand><rightOperand>PartialGroupStatus2Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalGroupInformationAndStatus[*]/GroupStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OriginalGroupInformationAndStatus[*]/GroupStatus</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT (Rejected), then
	 * OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present,
	 * must be equal to RJCT (Rejected).
	 */
	public static void checkCustomerPaymentStatusReportV07(CustomerPaymentStatusReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT (Rejected), then
	 * OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present,
	 * must be equal to RJCT (Rejected).
	 */
	public static void checkCustomerPaymentStatusReportV08(CustomerPaymentStatusReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT (Rejected), then
	 * TransactionInformationAndStatus/TransactionStatus, if present, must be
	 * equal to RJCT (Rejected).
	 */
	public static void checkFIToFIPaymentStatusReportV08(FIToFIPaymentStatusReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT (Rejected), then
	 * TransactionInformationAndStatus/TransactionStatus, if present, must be
	 * equal to RJCT (Rejected).
	 */
	public static void checkFIToFIPaymentStatusReportV07(FIToFIPaymentStatusReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT, then
	 * OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present,
	 * must be equal to RJCT.
	 */
	public static void checkCustomerPaymentStatusReportV03(CustomerPaymentStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT, then
	 * OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present,
	 * must be equal to RJCT.
	 */
	public static void checkCustomerPaymentStatusReportV04(CustomerPaymentStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT, then
	 * OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present,
	 * must be equal to RJCT.
	 */
	public static void checkCustomerPaymentStatusReportV05(CustomerPaymentStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT, then
	 * OriginalPaymentInformationAndStatus/PaymentInformationStatus, if present,
	 * must be equal to RJCT.
	 */
	public static void checkCustomerPaymentStatusReportV06(CustomerPaymentStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT, then TransactionInformationAndStatus/TransactionStatus, if
	 * present, must be equal to RJCT.
	 */
	public static void checkFIToFIPaymentStatusReportV03(FIToFIPaymentStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT, then TransactionInformationAndStatus/TransactionStatus, if
	 * present, must be equal to RJCT.
	 */
	public static void checkFIToFIPaymentStatusReportV04(FIToFIPaymentStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT, then TransactionInformationAndStatus/TransactionStatus, if
	 * present, must be equal to RJCT.
	 */
	public static void checkFIToFIPaymentStatusReportV05(FIToFIPaymentStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RJCT, then TransactionInformationAndStatus/TransactionStatus, if
	 * present, must be equal to RJCT.
	 */
	public static void checkFIToFIPaymentStatusReportV06(FIToFIPaymentStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}