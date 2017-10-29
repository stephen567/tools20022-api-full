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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.DateFormat6Choice;
import com.tools20022.repository.entity.CorporateActionEvent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies corporate action date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#ResponseDeadline
 * CorporateActionDate6.ResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#SubscriptionCostDebitDate
 * CorporateActionDate6.SubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#MarketDeadline
 * CorporateActionDate6.MarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#ExpiryDate
 * CorporateActionDate6.ExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#CoverExpirationDate
 * CorporateActionDate6.CoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#ProtectDate
 * CorporateActionDate6.ProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#TradingDate
 * CorporateActionDate6.TradingDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionDate6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action date."</li>
 * </ul>
 */
public class CorporateActionDate6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date/time at which the account servicer has set as the deadline to
	 * respond, with instructions, to an outstanding event. This time is
	 * dependent on the reference time zone of the account servicer as specified
	 * in a Service Level Agreement (SLA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ResponseDeadline
	 * CorporateActionDeadline.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6
	 * CorporateActionDate6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ResponseDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.ResponseDeadline;
			isDerived = false;
			xmlTag = "RspnDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDeadline";
			definition = "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};
	/**
	 * Date/time by which cash must be in place in order to take part in the
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#SubscriptionCostDebitDate
	 * BiddingConditions.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6
	 * CorporateActionDate6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptCostDbtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionCostDebitDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time by which cash must be in place in order to take part in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SubscriptionCostDebitDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.BiddingConditions.SubscriptionCostDebitDate;
			isDerived = false;
			xmlTag = "SbcptCostDbtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date/time by which cash must be in place in order to take part in the event.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};
	/**
	 * Issuer or issuer's agent deadline to respond, with an instruction, to an
	 * outstanding offer or privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#MarketDeadline
	 * Deadline.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6
	 * CorporateActionDate6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer or issuer's agent deadline to respond, with an instruction, to an outstanding offer or privilege."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute MarketDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.MarketDeadline;
			isDerived = false;
			xmlTag = "MktDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Issuer or issuer's agent deadline to respond, with an instruction, to an outstanding offer or privilege.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};
	/**
	 * Date/time at which an order expires or on which a privilege or offer
	 * terminates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ExpiryDate
	 * CorporateActionDeadline.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6
	 * CorporateActionDate6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an order expires or on which a privilege or offer terminates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExpiryDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.ExpiryDate;
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date/time at which an order expires or on which a privilege or offer terminates.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};
	/**
	 * Last day a holder can deliver the securities that it had elected on
	 * and/or previously protected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#CoverExpirationDate
	 * CorporateActionDeadline.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6
	 * CorporateActionDate6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day a holder can deliver the securities that it had elected on and/or previously protected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CoverExpirationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.CoverExpirationDate;
			isDerived = false;
			xmlTag = "CoverXprtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had elected on and/or previously protected.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};
	/**
	 * Last date/time a holder can request to defer delivery of securities
	 * pursuant to a notice of guaranteed delivery or other required
	 * documentation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ProtectDate
	 * CorporateActionDeadline.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6
	 * CorporateActionDate6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.ProtectDate;
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Last date/time a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};
	/**
	 * Date/time at which the deal (rights) was agreed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TradingDate
	 * CorporateActionEvent.TradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6
	 * CorporateActionDate6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the deal (rights) was agreed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TradingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.TradingDate;
			isDerived = false;
			xmlTag = "TradgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingDate";
			definition = "Date/time at which the deal (rights) was agreed.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate6.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate6.SubscriptionCostDebitDate,
						com.tools20022.repository.msg.CorporateActionDate6.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate6.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate6.CoverExpirationDate,
						com.tools20022.repository.msg.CorporateActionDate6.ProtectDate, com.tools20022.repository.msg.CorporateActionDate6.TradingDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate6";
				definition = "Specifies corporate action date.";
			}
		});
		return mmObject_lazy.get();
	}
}