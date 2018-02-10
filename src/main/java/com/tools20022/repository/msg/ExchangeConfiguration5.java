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
import com.tools20022.repository.codeset.ExchangePolicy1Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Configuration parameters of data exchanges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmExchangePolicy
 * ExchangeConfiguration5.mmExchangePolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmMaximumNumber
 * ExchangeConfiguration5.mmMaximumNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmMaximumAmount
 * ExchangeConfiguration5.mmMaximumAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmReTry
 * ExchangeConfiguration5.mmReTry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmTimeCondition
 * ExchangeConfiguration5.mmTimeCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmExchangeFailed
 * ExchangeConfiguration5.mmExchangeFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmExchangeDeclined
 * ExchangeConfiguration5.mmExchangeDeclined}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExchangeConfiguration5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters of data exchanges."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration7
 * ExchangeConfiguration7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3
 * ExchangeConfiguration3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExchangeConfiguration5", propOrder = {"exchangePolicy", "maximumNumber", "maximumAmount", "reTry", "timeCondition", "exchangeFailed", "exchangeDeclined"})
public class ExchangeConfiguration5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XchgPlcy", required = true)
	protected List<ExchangePolicy1Code> exchangePolicy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicy1Code
	 * ExchangePolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmExchangePolicy
	 * AcceptorConfiguration.mmExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
	 * ExchangeConfiguration5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgPlcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangePolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange policy between parties."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmExchangePolicy
	 * ExchangeConfiguration7.mmExchangePolicy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmExchangePolicy
	 * ExchangeConfiguration3.mmExchangePolicy}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangePolicy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmExchangePolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration5.mmObject();
			isDerived = false;
			xmlTag = "XchgPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration7.mmExchangePolicy);
			previousVersion_lazy = () -> ExchangeConfiguration3.mmExchangePolicy;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangePolicy1Code.mmObject();
		}
	};
	@XmlElement(name = "MaxNb")
	protected Number maximumNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmMaximumNumber
	 * AcceptorConfiguration.mmMaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
	 * ExchangeConfiguration5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of transactions without exchange."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmMaximumNumber
	 * ExchangeConfiguration7.mmMaximumNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmMaximumNumber
	 * ExchangeConfiguration3.mmMaximumNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmMaximumNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration5.mmObject();
			isDerived = false;
			xmlTag = "MaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration7.mmMaximumNumber);
			previousVersion_lazy = () -> ExchangeConfiguration3.mmMaximumNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "MaxAmt")
	protected ImpliedCurrencyAndAmount maximumAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmMaximumAmount
	 * AcceptorConfiguration.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
	 * ExchangeConfiguration5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum cumulative amount of the transactions without exchange."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmMaximumAmount
	 * ExchangeConfiguration7.mmMaximumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmMaximumAmount
	 * ExchangeConfiguration3.mmMaximumAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmMaximumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration5.mmObject();
			isDerived = false;
			xmlTag = "MaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration7.mmMaximumAmount);
			previousVersion_lazy = () -> ExchangeConfiguration3.mmMaximumAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ReTry")
	protected ProcessRetry2 reTry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessRetry2
	 * ProcessRetry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
	 * ExchangeConfiguration5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of retry process if activation of an action fails."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmReTry
	 * ExchangeConfiguration7.mmReTry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReTry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration5.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process if activation of an action fails.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration7.mmReTry);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessRetry2.mmObject();
		}
	};
	@XmlElement(name = "TmCond")
	protected ProcessTiming3 timeCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessTiming3
	 * ProcessTiming3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
	 * ExchangeConfiguration5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Timing condition for periodic exchanges."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmTimeCondition
	 * ExchangeConfiguration7.mmTimeCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmTimeCondition
	 * ExchangeConfiguration3.mmTimeCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTimeCondition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration5.mmObject();
			isDerived = false;
			xmlTag = "TmCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeCondition";
			definition = "Timing condition for periodic exchanges.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration7.mmTimeCondition);
			previousVersion_lazy = () -> ExchangeConfiguration3.mmTimeCondition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessTiming3.mmObject();
		}
	};
	@XmlElement(name = "XchgFaild")
	protected TrueFalseIndicator exchangeFailed;
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
	 * ExchangeConfiguration5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgFaild"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Failed transaction must be exchanged.\r\n"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmExchangeFailed
	 * ExchangeConfiguration7.mmExchangeFailed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmExchangeFailed
	 * ExchangeConfiguration3.mmExchangeFailed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeFailed = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration5.mmObject();
			isDerived = false;
			xmlTag = "XchgFaild";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeFailed";
			definition = "Failed transaction must be exchanged.\r\n";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration7.mmExchangeFailed);
			previousVersion_lazy = () -> ExchangeConfiguration3.mmExchangeFailed;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "XchgDclnd")
	protected TrueFalseIndicator exchangeDeclined;
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
	 * ExchangeConfiguration5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgDclnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that declined transaction must be exchanged."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmExchangeDeclined
	 * ExchangeConfiguration7.mmExchangeDeclined}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmExchangeDeclined
	 * ExchangeConfiguration3.mmExchangeDeclined}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeDeclined = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration5.mmObject();
			isDerived = false;
			xmlTag = "XchgDclnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeDeclined";
			definition = "Indicates that declined transaction must be exchanged.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration7.mmExchangeDeclined);
			previousVersion_lazy = () -> ExchangeConfiguration3.mmExchangeDeclined;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration5.mmExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration5.mmMaximumNumber,
						com.tools20022.repository.msg.ExchangeConfiguration5.mmMaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration5.mmReTry, com.tools20022.repository.msg.ExchangeConfiguration5.mmTimeCondition,
						com.tools20022.repository.msg.ExchangeConfiguration5.mmExchangeFailed, com.tools20022.repository.msg.ExchangeConfiguration5.mmExchangeDeclined);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExchangeConfiguration5";
				definition = "Configuration parameters of data exchanges.";
				nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration7.mmObject());
				previousVersion_lazy = () -> ExchangeConfiguration3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ExchangePolicy1Code> getExchangePolicy() {
		return exchangePolicy == null ? exchangePolicy = new ArrayList<>() : exchangePolicy;
	}

	public ExchangeConfiguration5 setExchangePolicy(List<ExchangePolicy1Code> exchangePolicy) {
		this.exchangePolicy = Objects.requireNonNull(exchangePolicy);
		return this;
	}

	public Optional<Number> getMaximumNumber() {
		return maximumNumber == null ? Optional.empty() : Optional.of(maximumNumber);
	}

	public ExchangeConfiguration5 setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = maximumNumber;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumAmount() {
		return maximumAmount == null ? Optional.empty() : Optional.of(maximumAmount);
	}

	public ExchangeConfiguration5 setMaximumAmount(ImpliedCurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
		return this;
	}

	public Optional<ProcessRetry2> getReTry() {
		return reTry == null ? Optional.empty() : Optional.of(reTry);
	}

	public ExchangeConfiguration5 setReTry(com.tools20022.repository.msg.ProcessRetry2 reTry) {
		this.reTry = reTry;
		return this;
	}

	public Optional<ProcessTiming3> getTimeCondition() {
		return timeCondition == null ? Optional.empty() : Optional.of(timeCondition);
	}

	public ExchangeConfiguration5 setTimeCondition(com.tools20022.repository.msg.ProcessTiming3 timeCondition) {
		this.timeCondition = timeCondition;
		return this;
	}

	public Optional<TrueFalseIndicator> getExchangeFailed() {
		return exchangeFailed == null ? Optional.empty() : Optional.of(exchangeFailed);
	}

	public ExchangeConfiguration5 setExchangeFailed(TrueFalseIndicator exchangeFailed) {
		this.exchangeFailed = exchangeFailed;
		return this;
	}

	public Optional<TrueFalseIndicator> getExchangeDeclined() {
		return exchangeDeclined == null ? Optional.empty() : Optional.of(exchangeDeclined);
	}

	public ExchangeConfiguration5 setExchangeDeclined(TrueFalseIndicator exchangeDeclined) {
		this.exchangeDeclined = exchangeDeclined;
		return this;
	}
}