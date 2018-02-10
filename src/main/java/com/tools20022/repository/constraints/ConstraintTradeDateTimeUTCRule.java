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
 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
 * must be the local time of the place of trade, eg, of the stock exchange, or
 * of the selling broker for OTC.
 */
public class ConstraintTradeDateTimeUTCRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25
	 * SecuritiesTradeDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails32
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails25> forSecuritiesTradeDetails25 = new MMConstraint<SecuritiesTradeDetails25>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails32);
			owner_lazy = () -> SecuritiesTradeDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26
	 * SecuritiesTradeDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails34
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails34}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails26> forSecuritiesTradeDetails26 = new MMConstraint<SecuritiesTradeDetails26>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails34);
			owner_lazy = () -> SecuritiesTradeDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27
	 * SecuritiesTradeDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails27> forSecuritiesTradeDetails27 = new MMConstraint<SecuritiesTradeDetails27>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28
	 * SecuritiesTradeDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails28> forSecuritiesTradeDetails28 = new MMConstraint<SecuritiesTradeDetails28>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6
	 * SecuritiesTradeDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails38
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails38}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails6> forSecuritiesTradeDetails6 = new MMConstraint<SecuritiesTradeDetails6>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails38);
			owner_lazy = () -> SecuritiesTradeDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13
	 * SecuritiesTradeDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails13> forSecuritiesTradeDetails13 = new MMConstraint<SecuritiesTradeDetails13>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3
	 * SecuritiesTradeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails37
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails37}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails3> forSecuritiesTradeDetails3 = new MMConstraint<SecuritiesTradeDetails3>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails37);
			owner_lazy = () -> SecuritiesTradeDetails3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11
	 * SecuritiesTradeDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails11> forSecuritiesTradeDetails11 = new MMConstraint<SecuritiesTradeDetails11>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2
	 * SecuritiesTradeDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails31
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails31}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails2> forSecuritiesTradeDetails2 = new MMConstraint<SecuritiesTradeDetails2>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails31);
			owner_lazy = () -> SecuritiesTradeDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16
	 * SecuritiesTradeDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails16> forSecuritiesTradeDetails16 = new MMConstraint<SecuritiesTradeDetails16>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1
	 * SecuritiesTradeDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails33
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails33}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails1> forSecuritiesTradeDetails1 = new MMConstraint<SecuritiesTradeDetails1>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails33);
			owner_lazy = () -> SecuritiesTradeDetails1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15
	 * SecuritiesTradeDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails15> forSecuritiesTradeDetails15 = new MMConstraint<SecuritiesTradeDetails15>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order16 Order16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forOrder18
	 * ConstraintTradeDateTimeUTCRule.forOrder18}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Order16> forOrder16 = new MMConstraint<Order16>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkOrder16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forOrder18);
			owner_lazy = () -> Order16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order14 Order14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forOrder17
	 * ConstraintTradeDateTimeUTCRule.forOrder17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Order14> forOrder14 = new MMConstraint<Order14>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkOrder14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forOrder17);
			owner_lazy = () -> Order14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5
	 * SecuritiesTradeDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails5> forSecuritiesTradeDetails5 = new MMConstraint<SecuritiesTradeDetails5>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8
	 * SecuritiesTradeDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails8> forSecuritiesTradeDetails8 = new MMConstraint<SecuritiesTradeDetails8>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18
	 * SecuritiesTradeDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails36
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails36}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails18> forSecuritiesTradeDetails18 = new MMConstraint<SecuritiesTradeDetails18>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails36);
			owner_lazy = () -> SecuritiesTradeDetails18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails12
	 * SecuritiesTradeDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails12> forSecuritiesTradeDetails12 = new MMConstraint<SecuritiesTradeDetails12>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9
	 * SecuritiesTradeDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails9> forSecuritiesTradeDetails9 = new MMConstraint<SecuritiesTradeDetails9>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21
	 * SecuritiesTradeDetails21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails21> forSecuritiesTradeDetails21 = new MMConstraint<SecuritiesTradeDetails21>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31
	 * SecuritiesTradeDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails53
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails53}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails2
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails2}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails31> forSecuritiesTradeDetails31 = new MMConstraint<SecuritiesTradeDetails31>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails53);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails2;
			owner_lazy = () -> SecuritiesTradeDetails31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails51
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails1
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails33> forSecuritiesTradeDetails33 = new MMConstraint<SecuritiesTradeDetails33>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails51);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails1;
			owner_lazy = () -> SecuritiesTradeDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails55
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails55}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails6
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails6}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails38> forSecuritiesTradeDetails38 = new MMConstraint<SecuritiesTradeDetails38>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails55);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails6;
			owner_lazy = () -> SecuritiesTradeDetails38.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37
	 * SecuritiesTradeDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails56
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails56}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails3
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails3}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails37> forSecuritiesTradeDetails37 = new MMConstraint<SecuritiesTradeDetails37>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails56);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails3;
			owner_lazy = () -> SecuritiesTradeDetails37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36
	 * SecuritiesTradeDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails54
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails54}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails18
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails18}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails36> forSecuritiesTradeDetails36 = new MMConstraint<SecuritiesTradeDetails36>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails54);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails18;
			owner_lazy = () -> SecuritiesTradeDetails36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34
	 * SecuritiesTradeDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails52
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails52}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails26
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails26}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails34> forSecuritiesTradeDetails34 = new MMConstraint<SecuritiesTradeDetails34>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails52);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails26;
			owner_lazy = () -> SecuritiesTradeDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32
	 * SecuritiesTradeDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails50
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails50}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails25
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails25}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails32> forSecuritiesTradeDetails32 = new MMConstraint<SecuritiesTradeDetails32>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails25;
			owner_lazy = () -> SecuritiesTradeDetails32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order17 Order17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forOrder14
	 * ConstraintTradeDateTimeUTCRule.forOrder14}</li>
	 * </ul>
	 */
	public static final MMConstraint<Order17> forOrder17 = new MMConstraint<Order17>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkOrder17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forOrder14;
			owner_lazy = () -> Order17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order18 Order18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forOrder16
	 * ConstraintTradeDateTimeUTCRule.forOrder16}</li>
	 * </ul>
	 */
	public static final MMConstraint<Order18> forOrder18 = new MMConstraint<Order18>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkOrder18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forOrder16;
			owner_lazy = () -> Order18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44
	 * SecuritiesTradeDetails44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails44> forSecuritiesTradeDetails44 = new MMConstraint<SecuritiesTradeDetails44>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39
	 * SecuritiesTradeDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails39> forSecuritiesTradeDetails39 = new MMConstraint<SecuritiesTradeDetails39>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43
	 * SecuritiesTradeDetails43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails43> forSecuritiesTradeDetails43 = new MMConstraint<SecuritiesTradeDetails43>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails43.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41
	 * SecuritiesTradeDetails41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails41> forSecuritiesTradeDetails41 = new MMConstraint<SecuritiesTradeDetails41>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40
	 * SecuritiesTradeDetails40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails40> forSecuritiesTradeDetails40 = new MMConstraint<SecuritiesTradeDetails40>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46
	 * SecuritiesTradeDetails46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails46> forSecuritiesTradeDetails46 = new MMConstraint<SecuritiesTradeDetails46>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails46.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47
	 * SecuritiesTradeDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails47> forSecuritiesTradeDetails47 = new MMConstraint<SecuritiesTradeDetails47>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51
	 * SecuritiesTradeDetails51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails67
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails67}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails33
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails33}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails51> forSecuritiesTradeDetails51 = new MMConstraint<SecuritiesTradeDetails51>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails33;
			owner_lazy = () -> SecuritiesTradeDetails51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53
	 * SecuritiesTradeDetails53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails31
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails31}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails53> forSecuritiesTradeDetails53 = new MMConstraint<SecuritiesTradeDetails53>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails31;
			owner_lazy = () -> SecuritiesTradeDetails53.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55
	 * SecuritiesTradeDetails55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails38
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails38}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails55> forSecuritiesTradeDetails55 = new MMConstraint<SecuritiesTradeDetails55>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails38;
			owner_lazy = () -> SecuritiesTradeDetails55.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails37
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails37}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails56> forSecuritiesTradeDetails56 = new MMConstraint<SecuritiesTradeDetails56>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails37;
			owner_lazy = () -> SecuritiesTradeDetails56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54
	 * SecuritiesTradeDetails54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails36
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails36}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails54> forSecuritiesTradeDetails54 = new MMConstraint<SecuritiesTradeDetails54>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails54;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails36;
			owner_lazy = () -> SecuritiesTradeDetails54.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52
	 * SecuritiesTradeDetails52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails34
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails34}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails52> forSecuritiesTradeDetails52 = new MMConstraint<SecuritiesTradeDetails52>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails34;
			owner_lazy = () -> SecuritiesTradeDetails52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50
	 * SecuritiesTradeDetails50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails32
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails32}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails50> forSecuritiesTradeDetails50 = new MMConstraint<SecuritiesTradeDetails50>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails32;
			owner_lazy = () -> SecuritiesTradeDetails50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59
	 * SecuritiesTradeDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails59> forSecuritiesTradeDetails59 = new MMConstraint<SecuritiesTradeDetails59>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails59.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58
	 * SecuritiesTradeDetails58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails58> forSecuritiesTradeDetails58 = new MMConstraint<SecuritiesTradeDetails58>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails63> forSecuritiesTradeDetails63 = new MMConstraint<SecuritiesTradeDetails63>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails62> forSecuritiesTradeDetails62 = new MMConstraint<SecuritiesTradeDetails62>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60
	 * SecuritiesTradeDetails60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails60> forSecuritiesTradeDetails60 = new MMConstraint<SecuritiesTradeDetails60>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails60.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65
	 * SecuritiesTradeDetails65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails65> forSecuritiesTradeDetails65 = new MMConstraint<SecuritiesTradeDetails65>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails65.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66
	 * SecuritiesTradeDetails66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails66> forSecuritiesTradeDetails66 = new MMConstraint<SecuritiesTradeDetails66>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails66.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67
	 * SecuritiesTradeDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is present with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails51
	 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails67> forSecuritiesTradeDetails67 = new MMConstraint<SecuritiesTradeDetails67>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is present with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails51;
			owner_lazy = () -> SecuritiesTradeDetails67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70
	 * SecuritiesTradeDetails70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails70> forSecuritiesTradeDetails70 = new MMConstraint<SecuritiesTradeDetails70>() {
		{
			validator = ConstraintTradeDateTimeUTCRule::checkSecuritiesTradeDetails70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails70.mmObject();
		}
	};

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails25(SecuritiesTradeDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails26(SecuritiesTradeDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails27(SecuritiesTradeDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails28(SecuritiesTradeDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails6(SecuritiesTradeDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails13(SecuritiesTradeDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails3(SecuritiesTradeDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails11(SecuritiesTradeDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails2(SecuritiesTradeDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails16(SecuritiesTradeDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails1(SecuritiesTradeDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails15(SecuritiesTradeDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkOrder16(Order16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkOrder14(Order14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails5(SecuritiesTradeDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails8(SecuritiesTradeDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails18(SecuritiesTradeDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails12(SecuritiesTradeDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails9(SecuritiesTradeDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails21(SecuritiesTradeDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails31(SecuritiesTradeDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails33(SecuritiesTradeDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails38(SecuritiesTradeDetails38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails37(SecuritiesTradeDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails36(SecuritiesTradeDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails34(SecuritiesTradeDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails32(SecuritiesTradeDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkOrder17(Order17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkOrder18(Order18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails44(SecuritiesTradeDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails39(SecuritiesTradeDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails43(SecuritiesTradeDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails41(SecuritiesTradeDetails41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails40(SecuritiesTradeDetails40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails46(SecuritiesTradeDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails47(SecuritiesTradeDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails51(SecuritiesTradeDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails53(SecuritiesTradeDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails55(SecuritiesTradeDetails55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails56(SecuritiesTradeDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails54(SecuritiesTradeDetails54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails52(SecuritiesTradeDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails50(SecuritiesTradeDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails59(SecuritiesTradeDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails58(SecuritiesTradeDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails63(SecuritiesTradeDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails62(SecuritiesTradeDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails60(SecuritiesTradeDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails65(SecuritiesTradeDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails66(SecuritiesTradeDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is present with a time or a time + UTC indicator, then
	 * it must be the local time of the place of trade, eg, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails67(SecuritiesTradeDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails70(SecuritiesTradeDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}