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
 * The CashSettlementSystem codes are to be used only by agents directly
 * involved in the settlement process, such as local settlement agents, CSD's
 * and central banks.
 */
public class ConstraintCashClearingSystemRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9
	 * SettlementDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails9> forSettlementDetails9 = new MMConstraint<SettlementDetails9>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17
	 * SettlementDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails17> forSettlementDetails17 = new MMConstraint<SettlementDetails17>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30
	 * SettlementDetails30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails30> forSettlementDetails30 = new MMConstraint<SettlementDetails30>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32
	 * SettlementDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails32> forSettlementDetails32 = new MMConstraint<SettlementDetails32>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60
	 * SettlementDetails60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails71
	 * ConstraintCashClearingSystemRule.forSettlementDetails71}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails60> forSettlementDetails60 = new MMConstraint<SettlementDetails60>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails71);
			owner_lazy = () -> SettlementDetails60.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64
	 * SettlementDetails64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails64> forSettlementDetails64 = new MMConstraint<SettlementDetails64>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails64;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails64.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3
	 * SettlementDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails3> forSettlementDetails3 = new MMConstraint<SettlementDetails3>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16
	 * SettlementDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails16> forSettlementDetails16 = new MMConstraint<SettlementDetails16>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31
	 * SettlementDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails31> forSettlementDetails31 = new MMConstraint<SettlementDetails31>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40
	 * SettlementDetails40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails40> forSettlementDetails40 = new MMConstraint<SettlementDetails40>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62
	 * SettlementDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails72
	 * ConstraintCashClearingSystemRule.forSettlementDetails72}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails62> forSettlementDetails62 = new MMConstraint<SettlementDetails62>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails72);
			owner_lazy = () -> SettlementDetails62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63
	 * SettlementDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails63> forSettlementDetails63 = new MMConstraint<SettlementDetails63>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6
	 * SettlementDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails6> forSettlementDetails6 = new MMConstraint<SettlementDetails6>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails20> forSettlementDetails20 = new MMConstraint<SettlementDetails20>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24
	 * SettlementDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails24> forSettlementDetails24 = new MMConstraint<SettlementDetails24>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33
	 * SettlementDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails33> forSettlementDetails33 = new MMConstraint<SettlementDetails33>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45
	 * SettlementDetails45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails70
	 * ConstraintCashClearingSystemRule.forSettlementDetails70}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails45> forSettlementDetails45 = new MMConstraint<SettlementDetails45>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails70);
			owner_lazy = () -> SettlementDetails45.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54
	 * SettlementDetails54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails54> forSettlementDetails54 = new MMConstraint<SettlementDetails54>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails54;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails54.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1
	 * SettlementDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails1> forSettlementDetails1 = new MMConstraint<SettlementDetails1>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19
	 * SettlementDetails19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails19> forSettlementDetails19 = new MMConstraint<SettlementDetails19>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22
	 * SettlementDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails22> forSettlementDetails22 = new MMConstraint<SettlementDetails22>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35
	 * SettlementDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails35> forSettlementDetails35 = new MMConstraint<SettlementDetails35>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42
	 * SettlementDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails67
	 * ConstraintCashClearingSystemRule.forSettlementDetails67}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails42> forSettlementDetails42 = new MMConstraint<SettlementDetails42>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails67);
			owner_lazy = () -> SettlementDetails42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52
	 * SettlementDetails52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails52> forSettlementDetails52 = new MMConstraint<SettlementDetails52>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8
	 * SettlementDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails8> forSettlementDetails8 = new MMConstraint<SettlementDetails8>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11
	 * SettlementDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails11> forSettlementDetails11 = new MMConstraint<SettlementDetails11>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23
	 * SettlementDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails23> forSettlementDetails23 = new MMConstraint<SettlementDetails23>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37
	 * SettlementDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails37> forSettlementDetails37 = new MMConstraint<SettlementDetails37>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails69
	 * ConstraintCashClearingSystemRule.forSettlementDetails69}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails44> forSettlementDetails44 = new MMConstraint<SettlementDetails44>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails69);
			owner_lazy = () -> SettlementDetails44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53
	 * SettlementDetails53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails53> forSettlementDetails53 = new MMConstraint<SettlementDetails53>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails53.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7
	 * SettlementDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails7> forSettlementDetails7 = new MMConstraint<SettlementDetails7>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12
	 * SettlementDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails12> forSettlementDetails12 = new MMConstraint<SettlementDetails12>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28
	 * SettlementDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails28> forSettlementDetails28 = new MMConstraint<SettlementDetails28>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38
	 * SettlementDetails38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails38> forSettlementDetails38 = new MMConstraint<SettlementDetails38>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails38.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47
	 * SettlementDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails74
	 * ConstraintCashClearingSystemRule.forSettlementDetails74}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails47> forSettlementDetails47 = new MMConstraint<SettlementDetails47>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails74);
			owner_lazy = () -> SettlementDetails47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56
	 * SettlementDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails56> forSettlementDetails56 = new MMConstraint<SettlementDetails56>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2
	 * SettlementDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails2> forSettlementDetails2 = new MMConstraint<SettlementDetails2>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13
	 * SettlementDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails13> forSettlementDetails13 = new MMConstraint<SettlementDetails13>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27
	 * SettlementDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails27> forSettlementDetails27 = new MMConstraint<SettlementDetails27>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39
	 * SettlementDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails39> forSettlementDetails39 = new MMConstraint<SettlementDetails39>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48
	 * SettlementDetails48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails75
	 * ConstraintCashClearingSystemRule.forSettlementDetails75}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails48> forSettlementDetails48 = new MMConstraint<SettlementDetails48>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails48;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails75);
			owner_lazy = () -> SettlementDetails48.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57
	 * SettlementDetails57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails57> forSettlementDetails57 = new MMConstraint<SettlementDetails57>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43
	 * SettlementDetails43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashClearingSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails43> forSettlementDetails43 = new MMConstraint<SettlementDetails43>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashClearingSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails43.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10
	 * SettlementDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails10> forSettlementDetails10 = new MMConstraint<SettlementDetails10>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29
	 * SettlementDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails29> forSettlementDetails29 = new MMConstraint<SettlementDetails29>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5
	 * SettlementDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails5> forSettlementDetails5 = new MMConstraint<SettlementDetails5>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25
	 * SettlementDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails25> forSettlementDetails25 = new MMConstraint<SettlementDetails25>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26
	 * SettlementDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails26> forSettlementDetails26 = new MMConstraint<SettlementDetails26>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65
	 * SettlementDetails65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails65> forSettlementDetails65 = new MMConstraint<SettlementDetails65>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails65.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14
	 * SettlementDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails14> forSettlementDetails14 = new MMConstraint<SettlementDetails14>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41
	 * SettlementDetails41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails41> forSettlementDetails41 = new MMConstraint<SettlementDetails41>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61
	 * SettlementDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails73
	 * ConstraintCashClearingSystemRule.forSettlementDetails73}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails61> forSettlementDetails61 = new MMConstraint<SettlementDetails61>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails73);
			owner_lazy = () -> SettlementDetails61.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59
	 * SettlementDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails59> forSettlementDetails59 = new MMConstraint<SettlementDetails59>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails59.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15
	 * SettlementDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails15> forSettlementDetails15 = new MMConstraint<SettlementDetails15>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34
	 * SettlementDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails34> forSettlementDetails34 = new MMConstraint<SettlementDetails34>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49
	 * SettlementDetails49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails99
	 * ConstraintCashClearingSystemRule.forSettlementDetails99}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails49> forSettlementDetails49 = new MMConstraint<SettlementDetails49>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails99);
			owner_lazy = () -> SettlementDetails49.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58
	 * SettlementDetails58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails58> forSettlementDetails58 = new MMConstraint<SettlementDetails58>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36
	 * SettlementDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails36> forSettlementDetails36 = new MMConstraint<SettlementDetails36>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66
	 * SettlementDetails66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails66> forSettlementDetails66 = new MMConstraint<SettlementDetails66>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails66.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails93
	 * ConstraintCashClearingSystemRule.forSettlementDetails93}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails42
	 * ConstraintCashClearingSystemRule.forSettlementDetails42}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails67> forSettlementDetails67 = new MMConstraint<SettlementDetails67>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails93);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails42;
			owner_lazy = () -> SettlementDetails67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70
	 * SettlementDetails70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails90
	 * ConstraintCashClearingSystemRule.forSettlementDetails90}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails45
	 * ConstraintCashClearingSystemRule.forSettlementDetails45}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails70> forSettlementDetails70 = new MMConstraint<SettlementDetails70>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails90);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails45;
			owner_lazy = () -> SettlementDetails70.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69
	 * SettlementDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails95
	 * ConstraintCashClearingSystemRule.forSettlementDetails95}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails44
	 * ConstraintCashClearingSystemRule.forSettlementDetails44}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails69> forSettlementDetails69 = new MMConstraint<SettlementDetails69>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails95);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails44;
			owner_lazy = () -> SettlementDetails69.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71
	 * SettlementDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails96
	 * ConstraintCashClearingSystemRule.forSettlementDetails96}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails60
	 * ConstraintCashClearingSystemRule.forSettlementDetails60}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails71> forSettlementDetails71 = new MMConstraint<SettlementDetails71>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails96);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails60;
			owner_lazy = () -> SettlementDetails71.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails97
	 * ConstraintCashClearingSystemRule.forSettlementDetails97}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails62
	 * ConstraintCashClearingSystemRule.forSettlementDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails72> forSettlementDetails72 = new MMConstraint<SettlementDetails72>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails72;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails97);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails62;
			owner_lazy = () -> SettlementDetails72.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75
	 * SettlementDetails75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails91
	 * ConstraintCashClearingSystemRule.forSettlementDetails91}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails48
	 * ConstraintCashClearingSystemRule.forSettlementDetails48}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails75> forSettlementDetails75 = new MMConstraint<SettlementDetails75>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails75;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails91);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails48;
			owner_lazy = () -> SettlementDetails75.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73
	 * SettlementDetails73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails98
	 * ConstraintCashClearingSystemRule.forSettlementDetails98}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails61
	 * ConstraintCashClearingSystemRule.forSettlementDetails61}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails73> forSettlementDetails73 = new MMConstraint<SettlementDetails73>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails73;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails98);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails61;
			owner_lazy = () -> SettlementDetails73.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74
	 * SettlementDetails74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails92
	 * ConstraintCashClearingSystemRule.forSettlementDetails92}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails47
	 * ConstraintCashClearingSystemRule.forSettlementDetails47}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails74> forSettlementDetails74 = new MMConstraint<SettlementDetails74>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails74;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails92);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails47;
			owner_lazy = () -> SettlementDetails74.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81
	 * SettlementDetails81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails81> forSettlementDetails81 = new MMConstraint<SettlementDetails81>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails81;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails81.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76
	 * SettlementDetails76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails76> forSettlementDetails76 = new MMConstraint<SettlementDetails76>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails76;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails76.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80
	 * SettlementDetails80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails80> forSettlementDetails80 = new MMConstraint<SettlementDetails80>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails80;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails80.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78
	 * SettlementDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails78> forSettlementDetails78 = new MMConstraint<SettlementDetails78>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails78.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77
	 * SettlementDetails77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails77> forSettlementDetails77 = new MMConstraint<SettlementDetails77>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails77;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails77.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79
	 * SettlementDetails79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails79> forSettlementDetails79 = new MMConstraint<SettlementDetails79>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails79.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87
	 * SettlementDetails87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails87> forSettlementDetails87 = new MMConstraint<SettlementDetails87>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails87;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails87.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86
	 * SettlementDetails86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails86> forSettlementDetails86 = new MMConstraint<SettlementDetails86>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails86;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails86.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85
	 * SettlementDetails85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails85> forSettlementDetails85 = new MMConstraint<SettlementDetails85>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails85.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93
	 * SettlementDetails93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails101
	 * ConstraintCashClearingSystemRule.forSettlementDetails101}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails119
	 * ConstraintCashClearingSystemRule.forSettlementDetails119}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails67
	 * ConstraintCashClearingSystemRule.forSettlementDetails67}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails93> forSettlementDetails93 = new MMConstraint<SettlementDetails93>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails93;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails101,
					com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails119);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails67;
			owner_lazy = () -> SettlementDetails93.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90
	 * SettlementDetails90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails128
	 * ConstraintCashClearingSystemRule.forSettlementDetails128}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails70
	 * ConstraintCashClearingSystemRule.forSettlementDetails70}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails90> forSettlementDetails90 = new MMConstraint<SettlementDetails90>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails90;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails128);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails70;
			owner_lazy = () -> SettlementDetails90.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96
	 * SettlementDetails96}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails71
	 * ConstraintCashClearingSystemRule.forSettlementDetails71}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails96> forSettlementDetails96 = new MMConstraint<SettlementDetails96>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails96;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails71;
			owner_lazy = () -> SettlementDetails96.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97
	 * SettlementDetails97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails72
	 * ConstraintCashClearingSystemRule.forSettlementDetails72}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails97> forSettlementDetails97 = new MMConstraint<SettlementDetails97>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails72;
			owner_lazy = () -> SettlementDetails97.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99
	 * SettlementDetails99}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails125
	 * ConstraintCashClearingSystemRule.forSettlementDetails125}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails49
	 * ConstraintCashClearingSystemRule.forSettlementDetails49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails99> forSettlementDetails99 = new MMConstraint<SettlementDetails99>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails99;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails125);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails49;
			owner_lazy = () -> SettlementDetails99.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95
	 * SettlementDetails95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails121
	 * ConstraintCashClearingSystemRule.forSettlementDetails121}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails69
	 * ConstraintCashClearingSystemRule.forSettlementDetails69}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails95> forSettlementDetails95 = new MMConstraint<SettlementDetails95>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails95;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails121);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails69;
			owner_lazy = () -> SettlementDetails95.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91
	 * SettlementDetails91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails126
	 * ConstraintCashClearingSystemRule.forSettlementDetails126}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails75
	 * ConstraintCashClearingSystemRule.forSettlementDetails75}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails91> forSettlementDetails91 = new MMConstraint<SettlementDetails91>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails91;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails126);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails75;
			owner_lazy = () -> SettlementDetails91.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92
	 * SettlementDetails92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails127
	 * ConstraintCashClearingSystemRule.forSettlementDetails127}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails74
	 * ConstraintCashClearingSystemRule.forSettlementDetails74}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails92> forSettlementDetails92 = new MMConstraint<SettlementDetails92>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails92;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails127);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails74;
			owner_lazy = () -> SettlementDetails92.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98
	 * SettlementDetails98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails73
	 * ConstraintCashClearingSystemRule.forSettlementDetails73}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails98> forSettlementDetails98 = new MMConstraint<SettlementDetails98>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails98;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails73;
			owner_lazy = () -> SettlementDetails98.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101
	 * SettlementDetails101}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails120
	 * ConstraintCashClearingSystemRule.forSettlementDetails120}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails93
	 * ConstraintCashClearingSystemRule.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails101> forSettlementDetails101 = new MMConstraint<SettlementDetails101>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails101;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails120);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails101.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105
	 * SettlementDetails105}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails105> forSettlementDetails105 = new MMConstraint<SettlementDetails105>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails105;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails105.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106
	 * SettlementDetails106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails106> forSettlementDetails106 = new MMConstraint<SettlementDetails106>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails106;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails106.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104
	 * SettlementDetails104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails104> forSettlementDetails104 = new MMConstraint<SettlementDetails104>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails104;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails104.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111
	 * SettlementDetails111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails111> forSettlementDetails111 = new MMConstraint<SettlementDetails111>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails111;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails111.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112
	 * SettlementDetails112}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails112> forSettlementDetails112 = new MMConstraint<SettlementDetails112>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails112;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails112.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110
	 * SettlementDetails110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails110> forSettlementDetails110 = new MMConstraint<SettlementDetails110>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails110;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails110.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108
	 * SettlementDetails108}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails108> forSettlementDetails108 = new MMConstraint<SettlementDetails108>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails108;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails108.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107
	 * SettlementDetails107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails107> forSettlementDetails107 = new MMConstraint<SettlementDetails107>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails107;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails107.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115
	 * SettlementDetails115}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails115> forSettlementDetails115 = new MMConstraint<SettlementDetails115>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails115;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails115.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117
	 * SettlementDetails117}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails117> forSettlementDetails117 = new MMConstraint<SettlementDetails117>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails117;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails117.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116
	 * SettlementDetails116}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails116> forSettlementDetails116 = new MMConstraint<SettlementDetails116>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails116;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails116.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128
	 * SettlementDetails128}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails90
	 * ConstraintCashClearingSystemRule.forSettlementDetails90}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails128> forSettlementDetails128 = new MMConstraint<SettlementDetails128>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails128;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails90;
			owner_lazy = () -> SettlementDetails128.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120
	 * SettlementDetails120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails101
	 * ConstraintCashClearingSystemRule.forSettlementDetails101}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails120> forSettlementDetails120 = new MMConstraint<SettlementDetails120>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails120;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails101;
			owner_lazy = () -> SettlementDetails120.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119
	 * SettlementDetails119}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails93
	 * ConstraintCashClearingSystemRule.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails119> forSettlementDetails119 = new MMConstraint<SettlementDetails119>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails119;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails119.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125
	 * SettlementDetails125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashClearingSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails99
	 * ConstraintCashClearingSystemRule.forSettlementDetails99}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails125> forSettlementDetails125 = new MMConstraint<SettlementDetails125>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails125;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashClearingSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails99;
			owner_lazy = () -> SettlementDetails125.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126
	 * SettlementDetails126}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails91
	 * ConstraintCashClearingSystemRule.forSettlementDetails91}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails126> forSettlementDetails126 = new MMConstraint<SettlementDetails126>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails126;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails91;
			owner_lazy = () -> SettlementDetails126.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127
	 * SettlementDetails127}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails92
	 * ConstraintCashClearingSystemRule.forSettlementDetails92}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails127> forSettlementDetails127 = new MMConstraint<SettlementDetails127>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails127;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails92;
			owner_lazy = () -> SettlementDetails127.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121
	 * SettlementDetails121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails95
	 * ConstraintCashClearingSystemRule.forSettlementDetails95}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails121> forSettlementDetails121 = new MMConstraint<SettlementDetails121>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails121;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails95;
			owner_lazy = () -> SettlementDetails121.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134
	 * SettlementDetails134}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails134> forSettlementDetails134 = new MMConstraint<SettlementDetails134>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails134;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails134.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137
	 * SettlementDetails137}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails137> forSettlementDetails137 = new MMConstraint<SettlementDetails137>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails137;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails137.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132
	 * SettlementDetails132}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails132> forSettlementDetails132 = new MMConstraint<SettlementDetails132>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails132;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails132.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130
	 * SettlementDetails130}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails130> forSettlementDetails130 = new MMConstraint<SettlementDetails130>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails130;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails130.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131
	 * SettlementDetails131}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails131> forSettlementDetails131 = new MMConstraint<SettlementDetails131>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails131;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails131.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133
	 * SettlementDetails133}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails133> forSettlementDetails133 = new MMConstraint<SettlementDetails133>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails133;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails133.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139
	 * SettlementDetails139}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails139> forSettlementDetails139 = new MMConstraint<SettlementDetails139>() {
		{
			validator = ConstraintCashClearingSystemRule::checkSettlementDetails139;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails139.mmObject();
		}
	};

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails9(SettlementDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails17(SettlementDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails30(SettlementDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails32(SettlementDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails60(SettlementDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails64(SettlementDetails64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails3(SettlementDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails16(SettlementDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails31(SettlementDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails40(SettlementDetails40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails62(SettlementDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails63(SettlementDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails6(SettlementDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails20(SettlementDetails20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails24(SettlementDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails33(SettlementDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails45(SettlementDetails45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails54(SettlementDetails54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails1(SettlementDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails19(SettlementDetails19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails22(SettlementDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails35(SettlementDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails42(SettlementDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails52(SettlementDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails8(SettlementDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails11(SettlementDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails23(SettlementDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails37(SettlementDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails44(SettlementDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails53(SettlementDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails7(SettlementDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails12(SettlementDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails28(SettlementDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails38(SettlementDetails38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails47(SettlementDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails56(SettlementDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails2(SettlementDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails13(SettlementDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails27(SettlementDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails39(SettlementDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails48(SettlementDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails57(SettlementDetails57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashClearingSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails43(SettlementDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails10(SettlementDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails29(SettlementDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails5(SettlementDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails25(SettlementDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails26(SettlementDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails65(SettlementDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails14(SettlementDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails41(SettlementDetails41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails61(SettlementDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails59(SettlementDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails15(SettlementDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails34(SettlementDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails49(SettlementDetails49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails58(SettlementDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails36(SettlementDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails66(SettlementDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails67(SettlementDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails70(SettlementDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails69(SettlementDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails71(SettlementDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails72(SettlementDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails75(SettlementDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails73(SettlementDetails73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails74(SettlementDetails74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails81(SettlementDetails81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails76(SettlementDetails76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails80(SettlementDetails80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails78(SettlementDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails77(SettlementDetails77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails79(SettlementDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails87(SettlementDetails87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails86(SettlementDetails86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails85(SettlementDetails85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails93(SettlementDetails93 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails90(SettlementDetails90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails96(SettlementDetails96 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails97(SettlementDetails97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails99(SettlementDetails99 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails95(SettlementDetails95 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails91(SettlementDetails91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails92(SettlementDetails92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails98(SettlementDetails98 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails101(SettlementDetails101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails105(SettlementDetails105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails106(SettlementDetails106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails104(SettlementDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails111(SettlementDetails111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails112(SettlementDetails112 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails110(SettlementDetails110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails108(SettlementDetails108 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails107(SettlementDetails107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails115(SettlementDetails115 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails117(SettlementDetails117 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails116(SettlementDetails116 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails128(SettlementDetails128 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails120(SettlementDetails120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails119(SettlementDetails119 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashClearingSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails125(SettlementDetails125 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails126(SettlementDetails126 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails127(SettlementDetails127 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails121(SettlementDetails121 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails134(SettlementDetails134 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails137(SettlementDetails137 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails132(SettlementDetails132 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails130(SettlementDetails130 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails131(SettlementDetails131 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails133(SettlementDetails133 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails139(SettlementDetails139 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}