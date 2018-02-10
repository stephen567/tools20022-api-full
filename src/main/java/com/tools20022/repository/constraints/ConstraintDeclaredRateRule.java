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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If CorporateActionOptionDetails/RateAndAmountDetails/
 * IssuerDeclaredExchangeRate is present, then
 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
 */
public class ConstraintDeclaredRateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07
	 * CorporateActionNotificationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionNotificationV06
	 * ConstraintDeclaredRateRule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> forCorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07
	 * CorporateActionNotification002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V07> forCorporateActionNotification002V07 = new MMConstraint<CorporateActionNotification002V07>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionNotification002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			owner_lazy = () -> CorporateActionNotification002V07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06
	 * CorporateActionNotificationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionNotificationV07
	 * ConstraintDeclaredRateRule.forCorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionNotificationV05
	 * ConstraintDeclaredRateRule.forCorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> forCorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04
	 * CorporateActionNotificationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionNotificationV05
	 * ConstraintDeclaredRateRule.forCorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> forCorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05
	 * CorporateActionNotificationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionNotificationV06
	 * ConstraintDeclaredRateRule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionNotificationV04
	 * ConstraintDeclaredRateRule.forCorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> forCorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35
	 * CorporateActionRate35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate43
	 * ConstraintDeclaredRateRule.forCorporateActionRate43}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate35> forCorporateActionRate35 = new MMConstraint<CorporateActionRate35>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionRate35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate43);
			owner_lazy = () -> CorporateActionRate35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41
	 * CorporateActionRate41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. "
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate41> forCorporateActionRate41 = new MMConstraint<CorporateActionRate41>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionRate41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. ";
			owner_lazy = () -> CorporateActionRate41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43
	 * CorporateActionRate43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate66
	 * ConstraintDeclaredRateRule.forCorporateActionRate66}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate35
	 * ConstraintDeclaredRateRule.forCorporateActionRate35}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate43> forCorporateActionRate43 = new MMConstraint<CorporateActionRate43>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionRate43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate66);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate35;
			owner_lazy = () -> CorporateActionRate43.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56
	 * CorporateActionRate56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. "
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate56> forCorporateActionRate56 = new MMConstraint<CorporateActionRate56>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionRate56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. ";
			owner_lazy = () -> CorporateActionRate56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66
	 * CorporateActionRate66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate43
	 * ConstraintDeclaredRateRule.forCorporateActionRate43}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate66> forCorporateActionRate66 = new MMConstraint<CorporateActionRate66>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionRate66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. ";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate43;
			owner_lazy = () -> CorporateActionRate66.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78
	 * CorporateActionRate78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. "
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate78> forCorporateActionRate78 = new MMConstraint<CorporateActionRate78>() {
		{
			validator = ConstraintDeclaredRateRule::checkCorporateActionRate78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one. ";
			owner_lazy = () -> CorporateActionRate78.mmObject();
		}
	};

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void checkCorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void checkCorporateActionNotification002V07(CorporateActionNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void checkCorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void checkCorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void checkCorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate35(CorporateActionRate35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate41(CorporateActionRate41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate43(CorporateActionRate43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate56(CorporateActionRate56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate66(CorporateActionRate66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate78(CorporateActionRate78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}