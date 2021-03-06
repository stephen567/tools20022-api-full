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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Specifies trades linked to treasury operations such as the exchange of
 * currencies, the lending of cash amounts and the related derivatives trades
 * (options and non deliverable trades).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TreasuryTrade" src="doc-files/TreasuryTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#mmTreasuryTradeSettlementStatus
 * TreasuryTrade.mmTreasuryTradeSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#mmInformationPartyRole
 * TreasuryTrade.mmInformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#mmTreasurySettlementPartyRole
 * TreasuryTrade.mmTreasurySettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasuryTrade#mmPartyRole
 * TreasuryTrade.mmPartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmTreasuryTrade
 * InformationPartyRole.mmTreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTreasuryTrade
 * TreasuryTradeSettlementStatus.mmTreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole#mmTreasuryTrade
 * TreasuryTradePartyRole.mmTreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasurySettlementPartyRole#mmTreasuryTrade
 * TreasurySettlementPartyRole.mmTreasuryTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
 * ForeignExchangeTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ForeignExchangeSwap
 * ForeignExchangeSwap}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyOption
 * CurrencyOption}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement2
 * TradeAgreement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement4
 * TradeAgreement4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement8
 * TradeAgreement8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralInformation4
 * GeneralInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement1
 * TradeAgreement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement3
 * TradeAgreement3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement7
 * TradeAgreement7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement5
 * TradeAgreement5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement9
 * TradeAgreement9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SplitTradeDetails1
 * SplitTradeDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement11
 * TradeAgreement11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement12
 * TradeAgreement12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement10
 * TradeAgreement10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2 Trade2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1 Trade1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TreasuryProfile1
 * TreasuryProfile1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralInformation5
 * GeneralInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement15
 * TradeAgreement15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement14
 * TradeAgreement14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SplitTradeDetails3
 * SplitTradeDetails3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TreasuryTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies trades linked to treasury operations such as the exchange of currencies, the lending of cash amounts and the related derivatives trades (options and non deliverable trades)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class TreasuryTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.TreasuryTradeSettlementStatus> treasuryTradeSettlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTreasuryTrade
	 * TreasuryTradeSettlementStatus.mmTreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails1#mmStatusDetails
	 * SplitTradeDetails1.mmStatusDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3#mmStatusDetails
	 * SplitTradeDetails3.mmStatusDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade TreasuryTrade}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryTradeSettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the settlement status of a treasury trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TreasuryTrade, List<TreasuryTradeSettlementStatus>> mmTreasuryTradeSettlementStatus = new MMBusinessAssociationEnd<TreasuryTrade, List<TreasuryTradeSettlementStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(SplitTradeDetails1.mmStatusDetails, SplitTradeDetails3.mmStatusDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryTradeSettlementStatus";
			definition = "Specifies the settlement status of a treasury trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmTreasuryTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
		}

		@Override
		public List<TreasuryTradeSettlementStatus> getValue(TreasuryTrade obj) {
			return obj.getTreasuryTradeSettlementStatus();
		}

		@Override
		public void setValue(TreasuryTrade obj, List<TreasuryTradeSettlementStatus> value) {
			obj.setTreasuryTradeSettlementStatus(value);
		}
	};
	protected InformationPartyRole informationPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmTreasuryTrade
	 * InformationPartyRole.mmTreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade TreasuryTrade}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which provides prices, interest rates or exchange rates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TreasuryTrade, com.tools20022.repository.entity.InformationPartyRole> mmInformationPartyRole = new MMBusinessAssociationEnd<TreasuryTrade, com.tools20022.repository.entity.InformationPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Party which provides prices, interest rates or exchange rates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmTreasuryTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.InformationPartyRole getValue(TreasuryTrade obj) {
			return obj.getInformationPartyRole();
		}

		@Override
		public void setValue(TreasuryTrade obj, com.tools20022.repository.entity.InformationPartyRole value) {
			obj.setInformationPartyRole(value);
		}
	};
	protected List<com.tools20022.repository.entity.TreasurySettlementPartyRole> treasurySettlementPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TreasurySettlementPartyRole
	 * TreasurySettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasurySettlementPartyRole#mmTreasuryTrade
	 * TreasurySettlementPartyRole.mmTreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade TreasuryTrade}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasurySettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of the settlement of a treasury trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TreasuryTrade, List<TreasurySettlementPartyRole>> mmTreasurySettlementPartyRole = new MMBusinessAssociationEnd<TreasuryTrade, List<TreasurySettlementPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasurySettlementPartyRole";
			definition = "Role played by a party in the context of the settlement of a treasury trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasurySettlementPartyRole.mmTreasuryTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasurySettlementPartyRole.mmObject();
		}

		@Override
		public List<TreasurySettlementPartyRole> getValue(TreasuryTrade obj) {
			return obj.getTreasurySettlementPartyRole();
		}

		@Override
		public void setValue(TreasuryTrade obj, List<TreasurySettlementPartyRole> value) {
			obj.setTreasurySettlementPartyRole(value);
		}
	};
	protected List<TreasuryTradePartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole
	 * TreasuryTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole#mmTreasuryTrade
	 * TreasuryTradePartyRole.mmTreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade TreasuryTrade}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role played by a party in a treasury trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TreasuryTrade, List<TreasuryTradePartyRole>> mmPartyRole = new MMBusinessAssociationEnd<TreasuryTrade, List<TreasuryTradePartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role played by a party in a treasury trade.";
			minOccurs = 0;
			opposite_lazy = () -> TreasuryTradePartyRole.mmTreasuryTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TreasuryTradePartyRole.mmObject();
		}

		@Override
		public List<TreasuryTradePartyRole> getValue(TreasuryTrade obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(TreasuryTrade obj, List<TreasuryTradePartyRole> value) {
			obj.setPartyRole(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TreasuryTrade";
				definition = "Specifies trades linked to treasury operations such as the exchange of currencies, the lending of cash amounts and the related derivatives trades (options and non deliverable trades).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.mmTreasuryTrade, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmTreasuryTrade,
						TreasuryTradePartyRole.mmTreasuryTrade, com.tools20022.repository.entity.TreasurySettlementPartyRole.mmTreasuryTrade);
				subType_lazy = () -> Arrays.asList(ForeignExchangeTrade.mmObject(), ForeignExchangeSwap.mmObject(), CurrencyOption.mmObject());
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTrade.mmTreasuryTradeSettlementStatus, com.tools20022.repository.entity.TreasuryTrade.mmInformationPartyRole,
						com.tools20022.repository.entity.TreasuryTrade.mmTreasurySettlementPartyRole, com.tools20022.repository.entity.TreasuryTrade.mmPartyRole);
				derivationComponent_lazy = () -> Arrays.asList(TradeAgreement2.mmObject(), TradeAgreement4.mmObject(), TradeAgreement8.mmObject(), GeneralInformation4.mmObject(), TradeAgreement1.mmObject(), TradeAgreement3.mmObject(),
						TradeAgreement7.mmObject(), TradeAgreement5.mmObject(), TradeAgreement9.mmObject(), SplitTradeDetails1.mmObject(), TradeAgreement11.mmObject(), TradeAgreement12.mmObject(), TradeAgreement10.mmObject(),
						Trade2.mmObject(), Trade1.mmObject(), TreasuryProfile1.mmObject(), GeneralInformation5.mmObject(), TradeAgreement15.mmObject(), TradeAgreement14.mmObject(), SplitTradeDetails3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TreasuryTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<TreasuryTradeSettlementStatus> getTreasuryTradeSettlementStatus() {
		return treasuryTradeSettlementStatus == null ? treasuryTradeSettlementStatus = new ArrayList<>() : treasuryTradeSettlementStatus;
	}

	public TreasuryTrade setTreasuryTradeSettlementStatus(List<com.tools20022.repository.entity.TreasuryTradeSettlementStatus> treasuryTradeSettlementStatus) {
		this.treasuryTradeSettlementStatus = Objects.requireNonNull(treasuryTradeSettlementStatus);
		return this;
	}

	public InformationPartyRole getInformationPartyRole() {
		return informationPartyRole;
	}

	public TreasuryTrade setInformationPartyRole(com.tools20022.repository.entity.InformationPartyRole informationPartyRole) {
		this.informationPartyRole = Objects.requireNonNull(informationPartyRole);
		return this;
	}

	public List<TreasurySettlementPartyRole> getTreasurySettlementPartyRole() {
		return treasurySettlementPartyRole == null ? treasurySettlementPartyRole = new ArrayList<>() : treasurySettlementPartyRole;
	}

	public TreasuryTrade setTreasurySettlementPartyRole(List<com.tools20022.repository.entity.TreasurySettlementPartyRole> treasurySettlementPartyRole) {
		this.treasurySettlementPartyRole = Objects.requireNonNull(treasurySettlementPartyRole);
		return this;
	}

	public List<TreasuryTradePartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public TreasuryTrade setPartyRole(List<TreasuryTradePartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}
}