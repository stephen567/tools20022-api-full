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
 * Specifies the role of a trading party in a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#Principal
 * TradingCapacityCode.Principal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#CrossingPrincipal
 * TradingCapacityCode.CrossingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#RisklessPrincipal
 * TradingCapacityCode.RisklessPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#Proprietary
 * TradingCapacityCode.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingCapacityCode#Agent
 * TradingCapacityCode.Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#CrossingAgent
 * TradingCapacityCode.CrossingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#OtherAgent
 * TradingCapacityCode.OtherAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#PrincipalAgent
 * TradingCapacityCode.PrincipalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#ActingAgent
 * TradingCapacityCode.ActingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#InvestmentFirm
 * TradingCapacityCode.InvestmentFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#MarketMaker
 * TradingCapacityCode.MarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#MultilateralTradingFacility
 * TradingCapacityCode.MultilateralTradingFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#RegulatedMarket
 * TradingCapacityCode.RegulatedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#SystematicInternaliser
 * TradingCapacityCode.SystematicInternaliser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode#TransferAgent
 * TradingCapacityCode.TransferAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
 * TradingCapacity4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingCapacity6Code
 * TradingCapacity6Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
 * TradingCapacity3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingCapacity5Code
 * TradingCapacity5Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingCapacity8Code
 * TradingCapacity8Code}</li>
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
 * <li>"PRIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingCapacityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of a trading party in a transaction."</li>
 * </ul>
 */
public class TradingCapacityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trading as Principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading as Principal."</li>
	 * </ul>
	 */
	public static final MMCode Principal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Principal";
			definition = "Trading as Principal.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "PRIN";
		}
	};
	/**
	 * Crossing as a principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPRN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossingPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Crossing as a principal."</li>
	 * </ul>
	 */
	public static final MMCode CrossingPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossingPrincipal";
			definition = "Crossing as a principal.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "CPRN";
		}
	};
	/**
	 * Trading as a riskless principal, ie, the order to buy(sell) has been
	 * simultaneously offset by an order to sell (buy) with another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RisklessPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trading as a riskless principal, ie, the  order to buy(sell) has been simultaneously offset by an order to sell (buy) with another party."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RisklessPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RisklessPrincipal";
			definition = "Trading as a riskless principal, ie, the  order to buy(sell) has been simultaneously offset by an order to sell (buy) with another party.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "RISP";
		}
	};
	/**
	 * Trading for its firm. The transaction affects the firm's own account, not
	 * that of its customers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trading for its firm. The transaction affects the firm's own account, not that of its customers."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Proprietary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Proprietary";
			definition = "Trading for its firm. The transaction affects the firm's own account, not that of its customers.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Trading as Agent on behalf of a customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading as Agent on behalf of a customer."</li>
	 * </ul>
	 */
	public static final MMCode Agent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Agent";
			definition = "Trading as Agent on behalf of a customer.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "AGEN";
		}
	};
	/**
	 * Crossing as an agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Crossing as an agent."</li>
	 * </ul>
	 */
	public static final MMCode CrossingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossingAgent";
			definition = "Crossing as an agent.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "CAGN";
		}
	};
	/**
	 * Acting as an agent for a party other than a customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OAGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acting as an agent for a party other than a customer."</li>
	 * </ul>
	 */
	public static final MMCode OtherAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherAgent";
			definition = "Acting as an agent for a party other than a customer.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "OAGN";
		}
	};
	/**
	 * Acting as an agent for some executions and principal for others in the
	 * same transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acting as an agent for some executions and principal for others in the same transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PrincipalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrincipalAgent";
			definition = "Acting as an agent for some executions and principal for others in the same transaction.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "PRAG";
		}
	};
	/**
	 * Party acting as an agent for both customer and another person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BAGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party acting as an agent for both customer and another person."</li>
	 * </ul>
	 */
	public static final MMCode ActingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActingAgent";
			definition = "Party acting as an agent for both customer and another person.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "BAGN";
		}
	};
	/**
	 * Any legal person whose regular occupation or business is the provision of
	 * one or more investment services to third parties and/or the performance
	 * of one or more investment activities on a professional basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any legal person whose regular occupation or business is the provision of one or more investment services to third parties and/or the performance of one or more investment activities on a professional basis."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InvestmentFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFirm";
			definition = "Any legal person whose regular occupation or business is the provision of one or more investment services to third parties and/or the performance of one or more investment activities on a professional basis.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "INFI";
		}
	};
	/**
	 * Dealer or specialist that is trading for their own account in the OTC
	 * market. Market makers are expected to maintain an orderly market by being
	 * available to buy or sell.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dealer or specialist that is trading for their own account in the OTC market. Market makers are expected to maintain an orderly market by being available to buy or sell."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MarketMaker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMaker";
			definition = "Dealer or specialist that is trading for their own account in the OTC market. Market makers are expected to maintain an orderly market by being available to buy or sell.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "MKTM";
		}
	};
	/**
	 * Multilateral Trading Facility (MTF) is a multilateral system which brings
	 * together multiple third-party buying and selling interests in financial
	 * instruments in a way that results in a contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLTF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralTradingFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multilateral Trading Facility (MTF) is a multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MultilateralTradingFacility = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralTradingFacility";
			definition = "Multilateral Trading Facility (MTF) is a multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "MLTF";
		}
	};
	/**
	 * Regulated market on which financial instruments can be traded according
	 * to rules defined by the stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatedMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regulated market on which financial instruments can be traded according to rules defined by the stock exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RegulatedMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatedMarket";
			definition = "Regulated market on which financial instruments can be traded according to rules defined by the stock exchange.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "RMKT";
		}
	};
	/**
	 * Firms which, on an organised, frequent and systematic basis, deal on
	 * their own account by executing client orders outside a regulated market
	 * or an MTF. SIs have the obligation to provide, and make public, a
	 * definite bid and offer quote for liquid securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInternaliser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Firms which, on an organised, frequent and systematic basis, deal on their own account by executing client orders outside a regulated market or an MTF. SIs have the obligation to provide, and make public, a definite bid and offer quote for liquid securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SystematicInternaliser = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystematicInternaliser";
			definition = "Firms which, on an organised, frequent and systematic basis, deal on their own account by executing client orders outside a regulated market or an MTF. SIs have the obligation to provide, and make public, a definite bid and offer quote for liquid securities.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "SINT";
		}
	};
	/**
	 * Party appointed by the Fund Management Company. It updates records of
	 * investor accounts to reflect the daily investor purchases, redemptions,
	 * switches, transfers, and re-registrations. It ensures the timely
	 * settlement of transactions, and may provide tax information to the
	 * investor and/or to its intermediaries. It may calculate, collect, and
	 * rebate commissions. It prepares and distributes confirmations reflecting
	 * transactions, resulting in unit or cash account movements to the investor
	 * or the investor's intermediary. It responds to inquiries concerning
	 * account status, and processes the income distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed by the Fund Management Company. It updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TransferAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgent";
			definition = "Party appointed by the Fund Management Company. It updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.";
			owner_lazy = () -> TradingCapacityCode.mmObject();
			codeName = "TAGT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PRIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingCapacityCode";
				definition = "Specifies the role of a trading party in a transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingCapacityCode.Principal, com.tools20022.repository.codeset.TradingCapacityCode.CrossingPrincipal,
						com.tools20022.repository.codeset.TradingCapacityCode.RisklessPrincipal, com.tools20022.repository.codeset.TradingCapacityCode.Proprietary, com.tools20022.repository.codeset.TradingCapacityCode.Agent,
						com.tools20022.repository.codeset.TradingCapacityCode.CrossingAgent, com.tools20022.repository.codeset.TradingCapacityCode.OtherAgent, com.tools20022.repository.codeset.TradingCapacityCode.PrincipalAgent,
						com.tools20022.repository.codeset.TradingCapacityCode.ActingAgent, com.tools20022.repository.codeset.TradingCapacityCode.InvestmentFirm, com.tools20022.repository.codeset.TradingCapacityCode.MarketMaker,
						com.tools20022.repository.codeset.TradingCapacityCode.MultilateralTradingFacility, com.tools20022.repository.codeset.TradingCapacityCode.RegulatedMarket,
						com.tools20022.repository.codeset.TradingCapacityCode.SystematicInternaliser, com.tools20022.repository.codeset.TradingCapacityCode.TransferAgent);
				derivation_lazy = () -> Arrays.asList(TradingCapacity4Code.mmObject(), TradingCapacity6Code.mmObject(), TradingCapacity3Code.mmObject(), TradingCapacity5Code.mmObject(), TradingCapacity8Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}