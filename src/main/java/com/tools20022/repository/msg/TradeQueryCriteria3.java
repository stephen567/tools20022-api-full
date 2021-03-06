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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TradeAdditionalQueryCriteria3;
import com.tools20022.repository.msg.TradeDateTimeQueryCriteria2;
import com.tools20022.repository.msg.TradePartyQueryCriteria2;
import com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Query criteria on a trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3#mmTradeLifeCycleHistory
 * TradeQueryCriteria3.mmTradeLifeCycleHistory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3#mmOutstandingTradeIndicator
 * TradeQueryCriteria3.mmOutstandingTradeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3#mmTradePartyCriteria
 * TradeQueryCriteria3.mmTradePartyCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3#mmFinancialInstrumentCriteria
 * TradeQueryCriteria3.mmFinancialInstrumentCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3#mmTimeCriteria
 * TradeQueryCriteria3.mmTimeCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3#mmOtherCriteria
 * TradeQueryCriteria3.mmOtherCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeQueryCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Query criteria on a trade transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTimeCriteriaReportingDateTimeRule#forTradeQueryCriteria3
 * ConstraintTimeCriteriaReportingDateTimeRule.forTradeQueryCriteria3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeQueryCriteria3", propOrder = {"tradeLifeCycleHistory", "outstandingTradeIndicator", "tradePartyCriteria", "financialInstrumentCriteria", "timeCriteria", "otherCriteria"})
public class TradeQueryCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradLifeCyclHstry", required = true)
	protected TrueFalseIndicator tradeLifeCycleHistory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3
	 * TradeQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradLifeCyclHstry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLifeCycleHistory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Field to define whether the query response file will include all reports submitted for a trade [true]or only the current state of the trade [false].\r\n\r\nIf false is selected, the reporting timestamp field cannot be used.\r\n\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeQueryCriteria3, TrueFalseIndicator> mmTradeLifeCycleHistory = new MMMessageAttribute<TradeQueryCriteria3, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "TradLifeCyclHstry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeLifeCycleHistory";
			definition = "Field to define whether the query response file will include all reports submitted for a trade [true]or only the current state of the trade [false].\r\n\r\nIf false is selected, the reporting timestamp field cannot be used.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(TradeQueryCriteria3 obj) {
			return obj.getTradeLifeCycleHistory();
		}

		@Override
		public void setValue(TradeQueryCriteria3 obj, TrueFalseIndicator value) {
			obj.setTradeLifeCycleHistory(value);
		}
	};
	@XmlElement(name = "OutsdngTradInd", required = true)
	protected TrueFalseIndicator outstandingTradeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3
	 * TradeQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutsdngTradInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingTradeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Field to define whether if the query response file will include all trades or only the outstanding trades.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeQueryCriteria3, TrueFalseIndicator> mmOutstandingTradeIndicator = new MMMessageAttribute<TradeQueryCriteria3, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "OutsdngTradInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingTradeIndicator";
			definition = "Field to define whether if the query response file will include all trades or only the outstanding trades.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(TradeQueryCriteria3 obj) {
			return obj.getOutstandingTradeIndicator();
		}

		@Override
		public void setValue(TradeQueryCriteria3 obj, TrueFalseIndicator value) {
			obj.setOutstandingTradeIndicator(value);
		}
	};
	@XmlElement(name = "TradPtyCrit")
	protected TradePartyQueryCriteria2 tradePartyCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2
	 * TradePartyQueryCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3
	 * TradeQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPtyCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePartyCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query criteria related to counterparties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeQueryCriteria3, Optional<TradePartyQueryCriteria2>> mmTradePartyCriteria = new MMMessageAssociationEnd<TradeQueryCriteria3, Optional<TradePartyQueryCriteria2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "TradPtyCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePartyCriteria";
			definition = "Query criteria related to counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradePartyQueryCriteria2.mmObject();
		}

		@Override
		public Optional<TradePartyQueryCriteria2> getValue(TradeQueryCriteria3 obj) {
			return obj.getTradePartyCriteria();
		}

		@Override
		public void setValue(TradeQueryCriteria3 obj, Optional<TradePartyQueryCriteria2> value) {
			obj.setTradePartyCriteria(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmCrit")
	protected TradeSecurityIdentificationQueryCriteria2 financialInstrumentCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2
	 * TradeSecurityIdentificationQueryCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3
	 * TradeQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the query criteria related to financial instruments."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeQueryCriteria3, Optional<TradeSecurityIdentificationQueryCriteria2>> mmFinancialInstrumentCriteria = new MMMessageAssociationEnd<TradeQueryCriteria3, Optional<TradeSecurityIdentificationQueryCriteria2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentCriteria";
			definition = "Indicates the query criteria related to financial instruments.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeSecurityIdentificationQueryCriteria2.mmObject();
		}

		@Override
		public Optional<TradeSecurityIdentificationQueryCriteria2> getValue(TradeQueryCriteria3 obj) {
			return obj.getFinancialInstrumentCriteria();
		}

		@Override
		public void setValue(TradeQueryCriteria3 obj, Optional<TradeSecurityIdentificationQueryCriteria2> value) {
			obj.setFinancialInstrumentCriteria(value.orElse(null));
		}
	};
	@XmlElement(name = "TmCrit")
	protected TradeDateTimeQueryCriteria2 timeCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradeDateTimeQueryCriteria2
	 * TradeDateTimeQueryCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3
	 * TradeQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query criteria related to time values."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeQueryCriteria3, Optional<TradeDateTimeQueryCriteria2>> mmTimeCriteria = new MMMessageAssociationEnd<TradeQueryCriteria3, Optional<TradeDateTimeQueryCriteria2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "TmCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeCriteria";
			definition = "Query criteria related to time values.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeDateTimeQueryCriteria2.mmObject();
		}

		@Override
		public Optional<TradeDateTimeQueryCriteria2> getValue(TradeQueryCriteria3 obj) {
			return obj.getTimeCriteria();
		}

		@Override
		public void setValue(TradeQueryCriteria3 obj, Optional<TradeDateTimeQueryCriteria2> value) {
			obj.setTimeCriteria(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrCrit")
	protected TradeAdditionalQueryCriteria3 otherCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3
	 * TradeAdditionalQueryCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3
	 * TradeQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query criteria related to other fields."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeQueryCriteria3, Optional<TradeAdditionalQueryCriteria3>> mmOtherCriteria = new MMMessageAssociationEnd<TradeQueryCriteria3, Optional<TradeAdditionalQueryCriteria3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "OthrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCriteria";
			definition = "Query criteria related to other fields.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeAdditionalQueryCriteria3.mmObject();
		}

		@Override
		public Optional<TradeAdditionalQueryCriteria3> getValue(TradeQueryCriteria3 obj) {
			return obj.getOtherCriteria();
		}

		@Override
		public void setValue(TradeQueryCriteria3 obj, Optional<TradeAdditionalQueryCriteria3> value) {
			obj.setOtherCriteria(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeQueryCriteria3.mmTradeLifeCycleHistory, com.tools20022.repository.msg.TradeQueryCriteria3.mmOutstandingTradeIndicator,
						com.tools20022.repository.msg.TradeQueryCriteria3.mmTradePartyCriteria, com.tools20022.repository.msg.TradeQueryCriteria3.mmFinancialInstrumentCriteria,
						com.tools20022.repository.msg.TradeQueryCriteria3.mmTimeCriteria, com.tools20022.repository.msg.TradeQueryCriteria3.mmOtherCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTimeCriteriaReportingDateTimeRule.forTradeQueryCriteria3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeQueryCriteria3";
				definition = "Query criteria on a trade transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getTradeLifeCycleHistory() {
		return tradeLifeCycleHistory;
	}

	public TradeQueryCriteria3 setTradeLifeCycleHistory(TrueFalseIndicator tradeLifeCycleHistory) {
		this.tradeLifeCycleHistory = Objects.requireNonNull(tradeLifeCycleHistory);
		return this;
	}

	public TrueFalseIndicator getOutstandingTradeIndicator() {
		return outstandingTradeIndicator;
	}

	public TradeQueryCriteria3 setOutstandingTradeIndicator(TrueFalseIndicator outstandingTradeIndicator) {
		this.outstandingTradeIndicator = Objects.requireNonNull(outstandingTradeIndicator);
		return this;
	}

	public Optional<TradePartyQueryCriteria2> getTradePartyCriteria() {
		return tradePartyCriteria == null ? Optional.empty() : Optional.of(tradePartyCriteria);
	}

	public TradeQueryCriteria3 setTradePartyCriteria(TradePartyQueryCriteria2 tradePartyCriteria) {
		this.tradePartyCriteria = tradePartyCriteria;
		return this;
	}

	public Optional<TradeSecurityIdentificationQueryCriteria2> getFinancialInstrumentCriteria() {
		return financialInstrumentCriteria == null ? Optional.empty() : Optional.of(financialInstrumentCriteria);
	}

	public TradeQueryCriteria3 setFinancialInstrumentCriteria(TradeSecurityIdentificationQueryCriteria2 financialInstrumentCriteria) {
		this.financialInstrumentCriteria = financialInstrumentCriteria;
		return this;
	}

	public Optional<TradeDateTimeQueryCriteria2> getTimeCriteria() {
		return timeCriteria == null ? Optional.empty() : Optional.of(timeCriteria);
	}

	public TradeQueryCriteria3 setTimeCriteria(TradeDateTimeQueryCriteria2 timeCriteria) {
		this.timeCriteria = timeCriteria;
		return this;
	}

	public Optional<TradeAdditionalQueryCriteria3> getOtherCriteria() {
		return otherCriteria == null ? Optional.empty() : Optional.of(otherCriteria);
	}

	public TradeQueryCriteria3 setOtherCriteria(TradeAdditionalQueryCriteria3 otherCriteria) {
		this.otherCriteria = otherCriteria;
		return this;
	}
}