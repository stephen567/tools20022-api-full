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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.OrderStatus4Code;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.msg.CancelledStatusReason16;
import com.tools20022.repository.msg.PartiallySettledStatus10;
import com.tools20022.repository.msg.RejectedStatus9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of status for an order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.OrderStatus3Choice#Status
 * OrderStatus3Choice.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#Cancelled
 * OrderStatus3Choice.Cancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#ConditionallyAccepted
 * OrderStatus3Choice.ConditionallyAccepted}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OrderStatus3Choice#Rejected
 * OrderStatus3Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#Suspended
 * OrderStatus3Choice.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#PartiallySettled
 * OrderStatus3Choice.PartiallySettled}</li>
 * </ul>
 * </li>
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
 * "OrderStatus3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status for an order."</li>
 * </ul>
 */
public class OrderStatus3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of all the orders in the order message. There is no reason
	 * attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#OrderStatus
	 * SecuritiesOrderStatus.OrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message. There is no reason attached."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#Status
	 * OrderStatus5Choice.Status}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Status = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.OrderStatus;
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of all the orders in the order message. There is no reason attached.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.Status;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderStatus4Code.mmObject();
		}
	};
	/**
	 * Status of all the orders in the order message is cancelled. This status
	 * is used for orders that have been accepted or that have been entered in
	 * an order book but that can not be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason16
	 * CancelledStatusReason16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#StatusReason
	 * Status.StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message is cancelled. This status is used for orders that have been accepted or that have been entered in an order book but that can not be executed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#Cancelled
	 * OrderStatus5Choice.Cancelled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Cancelled = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of all the orders in the order message is cancelled. This status is used for orders that have been accepted or that have been entered in an order book but that can not be executed.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.Cancelled;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CancelledStatusReason16.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Status of all the orders in the order message is conditionally accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice
	 * ConditionallyAcceptedStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#ConditionallyAcceptedStatus
	 * SecuritiesOrderStatus.ConditionallyAcceptedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlyAccptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message is conditionally accepted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#ConditionallyAccepted
	 * OrderStatus5Choice.ConditionallyAccepted}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ConditionallyAccepted = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.ConditionallyAcceptedStatus;
			isDerived = false;
			xmlTag = "CondlyAccptd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyAccepted";
			definition = "Status of all the orders in the order message is conditionally accepted.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.ConditionallyAccepted;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ConditionallyAcceptedStatus3Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Status of all the orders in the order message is rejected. This status is
	 * used for orders that have not been accepted or entered in an order book.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectedStatus9
	 * RejectedStatus9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message is rejected. This status is used for orders that have not been accepted or entered in an order book."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#Rejected
	 * OrderStatus5Choice.Rejected}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Rejected = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			businessComponentTrace_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of all the orders in the order message is rejected. This status is used for orders that have not been accepted or entered in an order book.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.Rejected;
			minOccurs = 1;
			maxOccurs = 10;
			type_lazy = () -> RejectedStatus9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Status of all the orders in the order message is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice
	 * SuspendedStatusReason4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#SuspendedStatusReason
	 * SecuritiesOrderStatus.SuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sspd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message is suspended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#Suspended
	 * OrderStatus5Choice.Suspended}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Suspended = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.SuspendedStatusReason;
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Status of all the orders in the order message is suspended.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.Suspended;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspendedStatusReason4Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Status of all the orders in the order message is partially settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10
	 * PartiallySettledStatus10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#PartiallySettledStatusReason
	 * SecuritiesOrderStatus.PartiallySettledStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlySttld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message is partially settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#PartiallySettled
	 * OrderStatus5Choice.PartiallySettled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PartiallySettled = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.PartiallySettledStatusReason;
			isDerived = false;
			xmlTag = "PrtlySttld";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySettled";
			definition = "Status of all the orders in the order message is partially settled.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.PartiallySettled;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartiallySettledStatus10.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OrderStatus3Choice.Status, com.tools20022.repository.choice.OrderStatus3Choice.Cancelled,
						com.tools20022.repository.choice.OrderStatus3Choice.ConditionallyAccepted, com.tools20022.repository.choice.OrderStatus3Choice.Rejected, com.tools20022.repository.choice.OrderStatus3Choice.Suspended,
						com.tools20022.repository.choice.OrderStatus3Choice.PartiallySettled);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderStatus3Choice";
				definition = "Choice of status for an order.";
			}
		});
		return mmObject_lazy.get();
	}
}