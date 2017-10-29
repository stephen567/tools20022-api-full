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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of service for which the commission is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#ClientDirected
 * CommissionTypeV2Code.ClientDirected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#StepOut
 * CommissionTypeV2Code.StepOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#FrontEndLoad
 * CommissionTypeV2Code.FrontEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#Initial
 * CommissionTypeV2Code.Initial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#BackEndLoad
 * CommissionTypeV2Code.BackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#Trailer
 * CommissionTypeV2Code.Trailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#Regular
 * CommissionTypeV2Code.Regular}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#StepIn
 * CommissionTypeV2Code.StepIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#SoftDollar
 * CommissionTypeV2Code.SoftDollar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#SoftDollarStepIn
 * CommissionTypeV2Code.SoftDollarStepIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#SoftDollarStepOut
 * CommissionTypeV2Code.SoftDollarStepOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PlanSponsor
 * CommissionTypeV2Code.PlanSponsor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PercentageOfPrincipal
 * CommissionTypeV2Code.PercentageOfPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#Markup
 * CommissionTypeV2Code.Markup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#CommissionDePlacement
 * CommissionTypeV2Code.CommissionDePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#BrokerCredit
 * CommissionTypeV2Code.BrokerCredit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#Other
 * CommissionTypeV2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#FundBasedRenewal
 * CommissionTypeV2Code.FundBasedRenewal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#FlatFee
 * CommissionTypeV2Code.FlatFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PointsPerBondOrContract
 * CommissionTypeV2Code.PointsPerBondOrContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#DifferentialOrDeferredPayment
 * CommissionTypeV2Code.DifferentialOrDeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#BrokerageRate
 * CommissionTypeV2Code.BrokerageRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PerUnit
 * CommissionTypeV2Code.PerUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PercentageCommissionWaivedAsCashDiscount
 * CommissionTypeV2Code.PercentageCommissionWaivedAsCashDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PercentageCommissionWaivedAsAdditionalUnits
 * CommissionTypeV2Code.PercentageCommissionWaivedAsAdditionalUnits}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionType7Code
 * CommissionType7Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionType9Code
 * CommissionType9Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionType6Code
 * CommissionType6Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionType8Code
 * CommissionType8Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CLDI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommissionTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of service for which the commission is asked or paid."</li>
 * </ul>
 */
public class CommissionTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Commission is as per client agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientDirected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is as per client agreement."</li>
	 * </ul>
	 */
	public static final MMCode ClientDirected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientDirected";
			definition = "Commission is as per client agreement.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "CLDI";
		}
	};
	/**
	 * Commission for a step-out trade, charged by the step-out broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for a step-out trade, charged by the step-out broker."</li>
	 * </ul>
	 */
	public static final MMCode StepOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StepOut";
			definition = "Commission for a step-out trade, charged by the step-out broker.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "STEP";
		}
	};
	/**
	 * Commission for subscribing to an investment, paid at the time of the
	 * subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for subscribing to an investment, paid at the time of the subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMCode FrontEndLoad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndLoad";
			definition = "Commission for subscribing to an investment, paid at the time of the subscription.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "FEND";
		}
	};
	/**
	 * Commission paid at the time of first subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission paid at the time of first subscription."</li>
	 * </ul>
	 */
	public static final MMCode Initial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Initial";
			definition = "Commission paid at the time of first subscription.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "INIT";
		}
	};
	/**
	 * Commission for redeeming an investment, when an investor redeems an
	 * investment fund within a certain period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for redeeming  an investment, when an investor redeems an investment fund within a certain period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BackEndLoad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndLoad";
			definition = "Commission for redeeming  an investment, when an investor redeems an investment fund within a certain period of time.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "BEND";
		}
	};
	/**
	 * Commission that is calculated on the position of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission that is calculated on the position of an account."</li>
	 * </ul>
	 */
	public static final MMCode Trailer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trailer";
			definition = "Commission that is calculated on the position of an account.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "TRAI";
		}
	};
	/**
	 * Commission that is regular.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission that is regular."</li>
	 * </ul>
	 */
	public static final MMCode Regular = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Regular";
			definition = "Commission that is regular.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "REGU";
		}
	};
	/**
	 * Commission for a step-in trade, charged by the step-in broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for a step-in trade, charged by the step-in broker."</li>
	 * </ul>
	 */
	public static final MMCode StepIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StepIn";
			definition = "Commission for a step-in trade, charged by the step-in broker.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "STEI";
		}
	};
	/**
	 * Commission designated by the broker for third party services. The soft
	 * dollar arrangement refers to an arrangement wherean investment manager
	 * directs transactions to a brokerand, in exchange, the broker provides
	 * brokerage and research services to the investment manager. Soft dollar
	 * arrangements include proprietary and third party research arrangements,
	 * but do not include client-directed brokerage arrangements. The U.S.
	 * Securities Exchange Act of 1934, Section 238(e), created a "safe harbor"
	 * to protect investment managers from claims that they had breached their
	 * fiduciary duties by using their client commissions to pay a higher
	 * commission than they might have paid for execution services to acquire
	 * investment research. The SEC defines soft dollars as: The Commission has
	 * defined soft dollar practices as arrangements under which products or
	 * services, other than execution of securities transactions, are obtained
	 * through an adviser or a broker-dealer in exchange for the direction by
	 * the adviser of client brokerage transactions to the broker-dealer. An
	 * individual or firm must exercise "investment discretion" over an account,
	 * as defined in Section 3(a)(35) of the Exchange Act, in order to use
	 * client commissions to obtain research under Section 28(e) of the Exchange
	 * Act ("Section 28(e)").
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission designated by the broker for third party services. The soft dollar arrangement refers to an arrangement wherean investment manager directs transactions to a brokerand, in exchange, the broker provides brokerage and research services to the investment manager. Soft dollar arrangements include proprietary and third party research arrangements, but do not include client-directed brokerage arrangements. The U.S. Securities Exchange Act of 1934, Section 238(e), created a \"safe harbor\" to protect investment managers from claims that they had breached their fiduciary duties by using their client commissions to pay a higher commission than they might have paid for execution services to acquire investment research. The SEC defines soft dollars as: The Commission has defined soft dollar practices as arrangements under which products or services, other than execution of securities transactions, are obtained through an adviser or a broker-dealer in exchange for the direction by the adviser of client brokerage transactions to the broker-dealer. An individual or firm must exercise \"investment discretion\" over an account, as defined in Section 3(a)(35) of the Exchange Act, in order to use client commissions to obtain research under Section 28(e) of the Exchange Act (\"Section 28(e)\")."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SoftDollar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SoftDollar";
			definition = "Commission designated by the broker for third party services. The soft dollar arrangement refers to an arrangement wherean investment manager directs transactions to a brokerand, in exchange, the broker provides brokerage and research services to the investment manager. Soft dollar arrangements include proprietary and third party research arrangements, but do not include client-directed brokerage arrangements. The U.S. Securities Exchange Act of 1934, Section 238(e), created a \"safe harbor\" to protect investment managers from claims that they had breached their fiduciary duties by using their client commissions to pay a higher commission than they might have paid for execution services to acquire investment research. The SEC defines soft dollars as: The Commission has defined soft dollar practices as arrangements under which products or services, other than execution of securities transactions, are obtained through an adviser or a broker-dealer in exchange for the direction by the adviser of client brokerage transactions to the broker-dealer. An individual or firm must exercise \"investment discretion\" over an account, as defined in Section 3(a)(35) of the Exchange Act, in order to use client commissions to obtain research under Section 28(e) of the Exchange Act (\"Section 28(e)\").";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "SOFT";
		}
	};
	/**
	 * Commission that combines soft dollar and step-in commission
	 * characteristics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollarStepIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission that combines soft dollar and step-in commission characteristics."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SoftDollarStepIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SoftDollarStepIn";
			definition = "Commission that combines soft dollar and step-in commission characteristics.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "SOIN";
		}
	};
	/**
	 * Commission that combines soft dollar and step-out commission
	 * characteristics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollarStepOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission that combines soft dollar and step-out commission characteristics."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SoftDollarStepOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SoftDollarStepOut";
			definition = "Commission that combines soft dollar and step-out commission characteristics.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "SOUT";
		}
	};
	/**
	 * Commission for a plan sponsor's services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlanSponsor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission for a plan sponsor's services."</li>
	 * </ul>
	 */
	public static final MMCode PlanSponsor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlanSponsor";
			definition = "Commission for a plan sponsor's services.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "PLAN";
		}
	};
	/**
	 * Commission is a percentage of principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PERN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is a percentage of principal."</li>
	 * </ul>
	 */
	public static final MMCode PercentageOfPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfPrincipal";
			definition = "Commission is a percentage of principal.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "PERN";
		}
	};
	/**
	 * Amount or percentage that is added to an offer price when an investor
	 * buys from a broker or market maker. In this case, the price is adjusted
	 * to reflect changing market conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Markup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount or percentage that is added to an offer price when an investor buys from a broker or market maker.  In this case, the price is adjusted to reflect changing market conditions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Markup = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Markup";
			definition = "Amount or percentage that is added to an offer price when an investor buys from a broker or market maker.  In this case, the price is adjusted to reflect changing market conditions.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "MARK";
		}
	};
	/**
	 * Amount of cash due to an intermediary for selling a product, or services,
	 * to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDePlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash due to an intermediary for selling a product, or services, to a third party."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CommissionDePlacement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionDePlacement";
			definition = "Amount of cash due to an intermediary for selling a product, or services, to a third party.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "CDPL";
		}
	};
	/**
	 * Amount financed to cover the back-end load.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount financed to cover the back-end load."</li>
	 * </ul>
	 */
	public static final MMCode BrokerCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BrokerCredit";
			definition = "Amount financed to cover the back-end load.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "BCRD";
		}
	};
	/**
	 * Commission is another type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is another type of transaction."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Commission is another type of transaction.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Annual fund based renewal commission, expressed as a percentage of the
	 * deal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RNEW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBasedRenewal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Annual fund based renewal commission, expressed as a percentage of the deal."
	 * </li>
	 * </ul>
	 */
	public static final MMCode FundBasedRenewal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundBasedRenewal";
			definition = "Annual fund based renewal commission, expressed as a percentage of the deal.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "RNEW";
		}
	};
	/**
	 * Commission is a flat fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlatFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is a flat fee."</li>
	 * </ul>
	 */
	public static final MMCode FlatFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlatFee";
			definition = "Commission is a flat fee.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "FLAT";
		}
	};
	/**
	 * Commission is based on points per bond or contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PBOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointsPerBondOrContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is based on points per bond or contract."</li>
	 * </ul>
	 */
	public static final MMCode PointsPerBondOrContract = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointsPerBondOrContract";
			definition = "Commission is based on points per bond or contract.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "PBOC";
		}
	};
	/**
	 * Differential or deferred payment commission rate.  
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentialOrDeferredPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Differential or deferred payment commission rate.  "</li>
	 * </ul>
	 */
	public static final MMCode DifferentialOrDeferredPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentialOrDeferredPayment";
			definition = "Differential or deferred payment commission rate.  ";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "DFDP";
		}
	};
	/**
	 * Brokerage commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRKR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerageRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Brokerage commission."</li>
	 * </ul>
	 */
	public static final MMCode BrokerageRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerageRate";
			definition = "Brokerage commission.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "BRKR";
		}
	};
	/**
	 * Commission is per unit of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PERU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is per unit of financial instrument."</li>
	 * </ul>
	 */
	public static final MMCode PerUnit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerUnit";
			definition = "Commission is per unit of financial instrument.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "PERU";
		}
	};
	/**
	 * Commission is a percentage commission waived as cash discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PWCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageCommissionWaivedAsCashDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission is a percentage commission waived as cash discount."</li>
	 * </ul>
	 */
	public static final MMCode PercentageCommissionWaivedAsCashDiscount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageCommissionWaivedAsCashDiscount";
			definition = "Commission is a percentage commission waived as cash discount.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "PWCD";
		}
	};
	/**
	 * Commission is a percentage commission waived as additional units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PWEU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageCommissionWaivedAsAdditionalUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission is a percentage commission waived as additional units."</li>
	 * </ul>
	 */
	public static final MMCode PercentageCommissionWaivedAsAdditionalUnits = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageCommissionWaivedAsAdditionalUnits";
			definition = "Commission is a percentage commission waived as additional units.";
			owner_lazy = () -> CommissionTypeV2Code.mmObject();
			codeName = "PWEU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CLDI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CommissionTypeV2Code";
				definition = "Type of service for which the commission is asked or paid.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommissionTypeV2Code.ClientDirected, com.tools20022.repository.codeset.CommissionTypeV2Code.StepOut,
						com.tools20022.repository.codeset.CommissionTypeV2Code.FrontEndLoad, com.tools20022.repository.codeset.CommissionTypeV2Code.Initial, com.tools20022.repository.codeset.CommissionTypeV2Code.BackEndLoad,
						com.tools20022.repository.codeset.CommissionTypeV2Code.Trailer, com.tools20022.repository.codeset.CommissionTypeV2Code.Regular, com.tools20022.repository.codeset.CommissionTypeV2Code.StepIn,
						com.tools20022.repository.codeset.CommissionTypeV2Code.SoftDollar, com.tools20022.repository.codeset.CommissionTypeV2Code.SoftDollarStepIn, com.tools20022.repository.codeset.CommissionTypeV2Code.SoftDollarStepOut,
						com.tools20022.repository.codeset.CommissionTypeV2Code.PlanSponsor, com.tools20022.repository.codeset.CommissionTypeV2Code.PercentageOfPrincipal, com.tools20022.repository.codeset.CommissionTypeV2Code.Markup,
						com.tools20022.repository.codeset.CommissionTypeV2Code.CommissionDePlacement, com.tools20022.repository.codeset.CommissionTypeV2Code.BrokerCredit, com.tools20022.repository.codeset.CommissionTypeV2Code.Other,
						com.tools20022.repository.codeset.CommissionTypeV2Code.FundBasedRenewal, com.tools20022.repository.codeset.CommissionTypeV2Code.FlatFee,
						com.tools20022.repository.codeset.CommissionTypeV2Code.PointsPerBondOrContract, com.tools20022.repository.codeset.CommissionTypeV2Code.DifferentialOrDeferredPayment,
						com.tools20022.repository.codeset.CommissionTypeV2Code.BrokerageRate, com.tools20022.repository.codeset.CommissionTypeV2Code.PerUnit,
						com.tools20022.repository.codeset.CommissionTypeV2Code.PercentageCommissionWaivedAsCashDiscount, com.tools20022.repository.codeset.CommissionTypeV2Code.PercentageCommissionWaivedAsAdditionalUnits);
				derivation_lazy = () -> Arrays.asList(CommissionType7Code.mmObject(), CommissionType9Code.mmObject(), CommissionType6Code.mmObject(), CommissionType8Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}