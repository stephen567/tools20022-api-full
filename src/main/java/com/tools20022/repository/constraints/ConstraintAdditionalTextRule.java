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
 * If OptionType/Code is OTHR (Other), then
 * AdditionalInformation/AdditionalText/AdditionalInformation must be present.<br>
 * (MT564 NVR C5).
 */
public class ConstraintAdditionalTextRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115
	 * CorporateActionOption115}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption129
	 * ConstraintAdditionalTextRule.forCorporateActionOption129}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption100
	 * ConstraintAdditionalTextRule.forCorporateActionOption100}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption115> forCorporateActionOption115 = new MMConstraint<CorporateActionOption115>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption129);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption100;
			owner_lazy = () -> CorporateActionOption115.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption115 obj) throws Exception {
			checkCorporateActionOption115(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption19> forCorporateActionOption19 = new MMConstraint<CorporateActionOption19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption19.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption19 obj) throws Exception {
			checkCorporateActionOption19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56
	 * CorporateActionOption56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption56> forCorporateActionOption56 = new MMConstraint<CorporateActionOption56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption56.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption56 obj) throws Exception {
			checkCorporateActionOption56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption138
	 * ConstraintAdditionalTextRule.forCorporateActionOption138}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption114
	 * ConstraintAdditionalTextRule.forCorporateActionOption114}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption130> forCorporateActionOption130 = new MMConstraint<CorporateActionOption130>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption138);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption114;
			owner_lazy = () -> CorporateActionOption130.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption130 obj) throws Exception {
			checkCorporateActionOption130(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51
	 * CorporateActionOption51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption101
	 * ConstraintAdditionalTextRule.forCorporateActionOption101}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption51> forCorporateActionOption51 = new MMConstraint<CorporateActionOption51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption101);
			owner_lazy = () -> CorporateActionOption51.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption51 obj) throws Exception {
			checkCorporateActionOption51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135
	 * CorporateActionOption135}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption135> forCorporateActionOption135 = new MMConstraint<CorporateActionOption135>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption135.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption135 obj) throws Exception {
			checkCorporateActionOption135(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101
	 * CorporateActionOption101}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption114
	 * ConstraintAdditionalTextRule.forCorporateActionOption114}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption51
	 * ConstraintAdditionalTextRule.forCorporateActionOption51}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption101> forCorporateActionOption101 = new MMConstraint<CorporateActionOption101>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption114);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption51;
			owner_lazy = () -> CorporateActionOption101.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption101 obj) throws Exception {
			checkCorporateActionOption101(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114
	 * CorporateActionOption114}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption130
	 * ConstraintAdditionalTextRule.forCorporateActionOption130}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption101
	 * ConstraintAdditionalTextRule.forCorporateActionOption101}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption114> forCorporateActionOption114 = new MMConstraint<CorporateActionOption114>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption130);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption101;
			owner_lazy = () -> CorporateActionOption114.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption114 obj) throws Exception {
			checkCorporateActionOption114(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148
	 * CorporateActionOption148}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption148> forCorporateActionOption148 = new MMConstraint<CorporateActionOption148>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption148.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption148 obj) throws Exception {
			checkCorporateActionOption148(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125
	 * CorporateActionOption125}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption125> forCorporateActionOption125 = new MMConstraint<CorporateActionOption125>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption125.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption125 obj) throws Exception {
			checkCorporateActionOption125(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15
	 * CorporateActionOption15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption15> forCorporateActionOption15 = new MMConstraint<CorporateActionOption15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption15.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption15 obj) throws Exception {
			checkCorporateActionOption15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139
	 * CorporateActionOption139}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption129
	 * ConstraintAdditionalTextRule.forCorporateActionOption129}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption139> forCorporateActionOption139 = new MMConstraint<CorporateActionOption139>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption129;
			owner_lazy = () -> CorporateActionOption139.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption139 obj) throws Exception {
			checkCorporateActionOption139(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17
	 * CorporateActionOption17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption17> forCorporateActionOption17 = new MMConstraint<CorporateActionOption17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption17.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption17 obj) throws Exception {
			checkCorporateActionOption17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44
	 * CorporateActionOption44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption44> forCorporateActionOption44 = new MMConstraint<CorporateActionOption44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption44.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption44 obj) throws Exception {
			checkCorporateActionOption44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3
	 * CorporateActionOption3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption3> forCorporateActionOption3 = new MMConstraint<CorporateActionOption3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption3 obj) throws Exception {
			checkCorporateActionOption3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52
	 * CorporateActionOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption100
	 * ConstraintAdditionalTextRule.forCorporateActionOption100}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption52> forCorporateActionOption52 = new MMConstraint<CorporateActionOption52>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption100);
			owner_lazy = () -> CorporateActionOption52.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption52 obj) throws Exception {
			checkCorporateActionOption52(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34
	 * CorporateActionOption34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption34> forCorporateActionOption34 = new MMConstraint<CorporateActionOption34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption34.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption34 obj) throws Exception {
			checkCorporateActionOption34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55
	 * CorporateActionOption55}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption55> forCorporateActionOption55 = new MMConstraint<CorporateActionOption55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption55.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption55 obj) throws Exception {
			checkCorporateActionOption55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36
	 * CorporateActionOption36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption36> forCorporateActionOption36 = new MMConstraint<CorporateActionOption36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption36.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption36 obj) throws Exception {
			checkCorporateActionOption36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138
	 * CorporateActionOption138}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption130
	 * ConstraintAdditionalTextRule.forCorporateActionOption130}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption138> forCorporateActionOption138 = new MMConstraint<CorporateActionOption138>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption130;
			owner_lazy = () -> CorporateActionOption138.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption138 obj) throws Exception {
			checkCorporateActionOption138(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35
	 * CorporateActionOption35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption35> forCorporateActionOption35 = new MMConstraint<CorporateActionOption35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption35.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption35 obj) throws Exception {
			checkCorporateActionOption35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption108> forCorporateActionOption108 = new MMConstraint<CorporateActionOption108>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption108.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption108 obj) throws Exception {
			checkCorporateActionOption108(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45
	 * CorporateActionOption45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption45> forCorporateActionOption45 = new MMConstraint<CorporateActionOption45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption45.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption45 obj) throws Exception {
			checkCorporateActionOption45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106
	 * CorporateActionOption106}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption106> forCorporateActionOption106 = new MMConstraint<CorporateActionOption106>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption106.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption106 obj) throws Exception {
			checkCorporateActionOption106(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20
	 * CorporateActionOption20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption20> forCorporateActionOption20 = new MMConstraint<CorporateActionOption20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption20.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption20 obj) throws Exception {
			checkCorporateActionOption20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150
	 * CorporateActionOption150}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption150> forCorporateActionOption150 = new MMConstraint<CorporateActionOption150>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption150.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption150 obj) throws Exception {
			checkCorporateActionOption150(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133
	 * CorporateActionOption133}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption133> forCorporateActionOption133 = new MMConstraint<CorporateActionOption133>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption133.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption133 obj) throws Exception {
			checkCorporateActionOption133(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32
	 * CorporateActionOption32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption32> forCorporateActionOption32 = new MMConstraint<CorporateActionOption32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption32.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption32 obj) throws Exception {
			checkCorporateActionOption32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129
	 * CorporateActionOption129}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption139
	 * ConstraintAdditionalTextRule.forCorporateActionOption139}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption115
	 * ConstraintAdditionalTextRule.forCorporateActionOption115}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption129> forCorporateActionOption129 = new MMConstraint<CorporateActionOption129>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption139);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption115;
			owner_lazy = () -> CorporateActionOption129.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption129 obj) throws Exception {
			checkCorporateActionOption129(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127
	 * CorporateActionOption127}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption127> forCorporateActionOption127 = new MMConstraint<CorporateActionOption127>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption127.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption127 obj) throws Exception {
			checkCorporateActionOption127(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10
	 * CorporateActionOption10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption10> forCorporateActionOption10 = new MMConstraint<CorporateActionOption10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption10.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption10 obj) throws Exception {
			checkCorporateActionOption10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100
	 * CorporateActionOption100}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption115
	 * ConstraintAdditionalTextRule.forCorporateActionOption115}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption52
	 * ConstraintAdditionalTextRule.forCorporateActionOption52}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption100> forCorporateActionOption100 = new MMConstraint<CorporateActionOption100>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR, then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption115);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption52;
			owner_lazy = () -> CorporateActionOption100.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption100 obj) throws Exception {
			checkCorporateActionOption100(obj);
		}
	};

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption115(CorporateActionOption115 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption19(CorporateActionOption19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption56(CorporateActionOption56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption130(CorporateActionOption130 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption51(CorporateActionOption51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption135(CorporateActionOption135 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption101(CorporateActionOption101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption114(CorporateActionOption114 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption148(CorporateActionOption148 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption125(CorporateActionOption125 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption15(CorporateActionOption15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption139(CorporateActionOption139 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption17(CorporateActionOption17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption44(CorporateActionOption44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption3(CorporateActionOption3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption52(CorporateActionOption52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption34(CorporateActionOption34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption55(CorporateActionOption55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption36(CorporateActionOption36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption138(CorporateActionOption138 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption35(CorporateActionOption35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption108(CorporateActionOption108 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption45(CorporateActionOption45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption106(CorporateActionOption106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption20(CorporateActionOption20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption150(CorporateActionOption150 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption133(CorporateActionOption133 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption32(CorporateActionOption32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption129(CorporateActionOption129 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption127(CorporateActionOption127 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption10(CorporateActionOption10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR, then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption100(CorporateActionOption100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}