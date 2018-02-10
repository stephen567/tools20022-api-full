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
 * Unaffected balance and Affected balances should only be mentioned as a result
 * of the process that was run through the event. For instance lottery results,
 * Dutch auction results or tender offer results
 */
public class ConstraintAffectedAndUnaffectedBalanceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2
	 * CorporateActionBalanceDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails2> forCorporateActionBalanceDetails2 = new MMConstraint<CorporateActionBalanceDetails2>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6
	 * CorporateActionBalanceDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails6> forCorporateActionBalanceDetails6 = new MMConstraint<CorporateActionBalanceDetails6>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11
	 * CorporateActionBalanceDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails11> forCorporateActionBalanceDetails11 = new MMConstraint<CorporateActionBalanceDetails11>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14
	 * CorporateActionBalanceDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails14> forCorporateActionBalanceDetails14 = new MMConstraint<CorporateActionBalanceDetails14>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18
	 * CorporateActionBalanceDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule#forCorporateActionBalanceDetails22
	 * ConstraintAffectedAndUnaffectedBalanceRule.
	 * forCorporateActionBalanceDetails22}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails18> forCorporateActionBalanceDetails18 = new MMConstraint<CorporateActionBalanceDetails18>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails22);
			owner_lazy = () -> CorporateActionBalanceDetails18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19
	 * CorporateActionBalanceDetails19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails19> forCorporateActionBalanceDetails19 = new MMConstraint<CorporateActionBalanceDetails19>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1
	 * CorporateActionBalanceDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails1> forCorporateActionBalanceDetails1 = new MMConstraint<CorporateActionBalanceDetails1>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7
	 * CorporateActionBalanceDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails7> forCorporateActionBalanceDetails7 = new MMConstraint<CorporateActionBalanceDetails7>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails10> forCorporateActionBalanceDetails10 = new MMConstraint<CorporateActionBalanceDetails10>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13
	 * CorporateActionBalanceDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails13> forCorporateActionBalanceDetails13 = new MMConstraint<CorporateActionBalanceDetails13>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule#forCorporateActionBalanceDetails21
	 * ConstraintAffectedAndUnaffectedBalanceRule.
	 * forCorporateActionBalanceDetails21}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails17> forCorporateActionBalanceDetails17 = new MMConstraint<CorporateActionBalanceDetails17>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails21);
			owner_lazy = () -> CorporateActionBalanceDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20
	 * CorporateActionBalanceDetails20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails20> forCorporateActionBalanceDetails20 = new MMConstraint<CorporateActionBalanceDetails20>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21
	 * CorporateActionBalanceDetails21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule#forCorporateActionBalanceDetails29
	 * ConstraintAffectedAndUnaffectedBalanceRule.
	 * forCorporateActionBalanceDetails29}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule#forCorporateActionBalanceDetails17
	 * ConstraintAffectedAndUnaffectedBalanceRule.
	 * forCorporateActionBalanceDetails17}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails21> forCorporateActionBalanceDetails21 = new MMConstraint<CorporateActionBalanceDetails21>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails29);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails17;
			owner_lazy = () -> CorporateActionBalanceDetails21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22
	 * CorporateActionBalanceDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule#forCorporateActionBalanceDetails31
	 * ConstraintAffectedAndUnaffectedBalanceRule.
	 * forCorporateActionBalanceDetails31}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule#forCorporateActionBalanceDetails18
	 * ConstraintAffectedAndUnaffectedBalanceRule.
	 * forCorporateActionBalanceDetails18}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails22> forCorporateActionBalanceDetails22 = new MMConstraint<CorporateActionBalanceDetails22>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails31);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails18;
			owner_lazy = () -> CorporateActionBalanceDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25
	 * CorporateActionBalanceDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails25> forCorporateActionBalanceDetails25 = new MMConstraint<CorporateActionBalanceDetails25>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28
	 * CorporateActionBalanceDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails28> forCorporateActionBalanceDetails28 = new MMConstraint<CorporateActionBalanceDetails28>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31
	 * CorporateActionBalanceDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule#forCorporateActionBalanceDetails22
	 * ConstraintAffectedAndUnaffectedBalanceRule.
	 * forCorporateActionBalanceDetails22}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails31> forCorporateActionBalanceDetails31 = new MMConstraint<CorporateActionBalanceDetails31>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails22;
			owner_lazy = () -> CorporateActionBalanceDetails31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule#forCorporateActionBalanceDetails21
	 * ConstraintAffectedAndUnaffectedBalanceRule.
	 * forCorporateActionBalanceDetails21}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails29> forCorporateActionBalanceDetails29 = new MMConstraint<CorporateActionBalanceDetails29>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails21;
			owner_lazy = () -> CorporateActionBalanceDetails29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails35> forCorporateActionBalanceDetails35 = new MMConstraint<CorporateActionBalanceDetails35>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails36> forCorporateActionBalanceDetails36 = new MMConstraint<CorporateActionBalanceDetails36>() {
		{
			validator = ConstraintAffectedAndUnaffectedBalanceRule::checkCorporateActionBalanceDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results";
			owner_lazy = () -> CorporateActionBalanceDetails36.mmObject();
		}
	};

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails2(CorporateActionBalanceDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails6(CorporateActionBalanceDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails11(CorporateActionBalanceDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails14(CorporateActionBalanceDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails18(CorporateActionBalanceDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails19(CorporateActionBalanceDetails19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails1(CorporateActionBalanceDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails7(CorporateActionBalanceDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails10(CorporateActionBalanceDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails13(CorporateActionBalanceDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails17(CorporateActionBalanceDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails20(CorporateActionBalanceDetails20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails21(CorporateActionBalanceDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails22(CorporateActionBalanceDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails25(CorporateActionBalanceDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails28(CorporateActionBalanceDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails31(CorporateActionBalanceDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails29(CorporateActionBalanceDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails35(CorporateActionBalanceDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results
	 */
	public static void checkCorporateActionBalanceDetails36(CorporateActionBalanceDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}