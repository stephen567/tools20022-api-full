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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OrderStatus4Code;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CancelledStatusReason16;
import com.tools20022.repository.msg.PartiallySettledStatus10;
import com.tools20022.repository.msg.RejectedStatus9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of status for an order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmStatus
 * OrderStatus5Choice.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmCancelled
 * OrderStatus5Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmConditionallyAccepted
 * OrderStatus5Choice.mmConditionallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmRejected
 * OrderStatus5Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmSuspended
 * OrderStatus5Choice.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmInRepair
 * OrderStatus5Choice.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmPartiallySettled
 * OrderStatus5Choice.mmPartiallySettled}</li>
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
 * "OrderStatus5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status for an order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderStatus5Choice", propOrder = {"status", "cancelled", "conditionallyAccepted", "rejected", "suspended", "inRepair", "partiallySettled"})
public class OrderStatus5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected OrderStatus4Code status;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmOrderStatus
	 * SecuritiesOrderStatus.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice
	 * OrderStatus5Choice}</li>
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
	 * "Status of the individual order is accepted or already executed or sent to next party or received. There is no reason attached."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmStatus
	 * OrderStatus3Choice.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmStatus
	 * OrderStatus4Choice.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmOrderStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the individual order is accepted or already executed or sent to next party or received. There is no reason attached.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatus3Choice.mmStatus, OrderStatus4Choice.mmStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatus4Code.mmObject();
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatusReason16 cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason16
	 * CancelledStatusReason16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice
	 * OrderStatus5Choice}</li>
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
	 * "Status of the individual order is cancelled. This status is used for an order that has been accepted or that has been entered in an order book but that can not be executed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmCancelled
	 * OrderStatus3Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmCancelled
	 * OrderStatus4Choice.mmCancelled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancelled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of the individual order is cancelled. This status is used for an order that has been accepted or that has been entered in an order book but that can not be executed.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatus3Choice.mmCancelled, OrderStatus4Choice.mmCancelled);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatusReason16.mmObject();
		}
	};
	@XmlElement(name = "CondlyAccptd", required = true)
	protected ConditionallyAcceptedStatus3Choice conditionallyAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice
	 * ConditionallyAcceptedStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
	 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice
	 * OrderStatus5Choice}</li>
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
	 * definition} = "Status of the individual order is conditionally accepted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmConditionallyAccepted
	 * OrderStatus3Choice.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmConditionallyAccepted
	 * OrderStatus4Choice.mmConditionallyAccepted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConditionallyAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConditionallyAcceptedStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "CondlyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyAccepted";
			definition = "Status of the individual order is conditionally accepted.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatus3Choice.mmConditionallyAccepted, OrderStatus4Choice.mmConditionallyAccepted);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice.mmObject();
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected List<RejectedStatus9> rejected;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice
	 * OrderStatus5Choice}</li>
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
	 * "Status of the individual order is rejected. This status is used for an order that has not been accepted or entered in an order book."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmRejected
	 * OrderStatus3Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmRejected
	 * OrderStatus4Choice.mmRejected}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrderStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the individual order is rejected. This status is used for an order that has not been accepted or entered in an order book.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatus3Choice.mmRejected, OrderStatus4Choice.mmRejected);
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus9.mmObject();
		}
	};
	@XmlElement(name = "Sspd", required = true)
	protected SuspendedStatusReason4Choice suspended;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice
	 * SuspendedStatusReason4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSuspendedStatusReason
	 * SecuritiesOrderStatus.mmSuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice
	 * OrderStatus5Choice}</li>
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
	 * definition} = "Status of the individual order is suspended."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmSuspended
	 * OrderStatus3Choice.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmSuspended
	 * OrderStatus4Choice.mmSuspended}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSuspended = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Status of the individual order is suspended.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatus3Choice.mmSuspended, OrderStatus4Choice.mmSuspended);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.SuspendedStatusReason4Choice.mmObject();
		}
	};
	@XmlElement(name = "InRpr", required = true)
	protected InRepairStatusReason4Choice inRepair;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice
	 * InRepairStatusReason4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice
	 * OrderStatus5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InRpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the individual order is in repair."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmInRepair
	 * OrderStatus4Choice.mmInRepair}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInRepair = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "InRpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Status of the individual order is in repair.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatus4Choice.mmInRepair);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.InRepairStatusReason4Choice.mmObject();
		}
	};
	@XmlElement(name = "PrtlySttld", required = true)
	protected PartiallySettledStatus10 partiallySettled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10
	 * PartiallySettledStatus10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmPartiallySettledStatusReason
	 * SecuritiesOrderStatus.mmPartiallySettledStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice
	 * OrderStatus5Choice}</li>
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
	 * definition} = "Status of the individual order is partially settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmPartiallySettled
	 * OrderStatus3Choice.mmPartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmPartiallySettled
	 * OrderStatus4Choice.mmPartiallySettled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartiallySettled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmPartiallySettledStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtlySttld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySettled";
			definition = "Status of the individual order is partially settled.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatus3Choice.mmPartiallySettled, OrderStatus4Choice.mmPartiallySettled);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartiallySettledStatus10.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OrderStatus5Choice.mmStatus, com.tools20022.repository.choice.OrderStatus5Choice.mmCancelled,
						com.tools20022.repository.choice.OrderStatus5Choice.mmConditionallyAccepted, com.tools20022.repository.choice.OrderStatus5Choice.mmRejected, com.tools20022.repository.choice.OrderStatus5Choice.mmSuspended,
						com.tools20022.repository.choice.OrderStatus5Choice.mmInRepair, com.tools20022.repository.choice.OrderStatus5Choice.mmPartiallySettled);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderStatus5Choice";
				definition = "Choice of status for an order.";
			}
		});
		return mmObject_lazy.get();
	}

	public OrderStatus4Code getStatus() {
		return status;
	}

	public OrderStatus5Choice setStatus(OrderStatus4Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public CancelledStatusReason16 getCancelled() {
		return cancelled;
	}

	public OrderStatus5Choice setCancelled(CancelledStatusReason16 cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public ConditionallyAcceptedStatus3Choice getConditionallyAccepted() {
		return conditionallyAccepted;
	}

	public OrderStatus5Choice setConditionallyAccepted(com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice conditionallyAccepted) {
		this.conditionallyAccepted = Objects.requireNonNull(conditionallyAccepted);
		return this;
	}

	public List<RejectedStatus9> getRejected() {
		return rejected == null ? rejected = new ArrayList<>() : rejected;
	}

	public OrderStatus5Choice setRejected(List<RejectedStatus9> rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public SuspendedStatusReason4Choice getSuspended() {
		return suspended;
	}

	public OrderStatus5Choice setSuspended(com.tools20022.repository.choice.SuspendedStatusReason4Choice suspended) {
		this.suspended = Objects.requireNonNull(suspended);
		return this;
	}

	public InRepairStatusReason4Choice getInRepair() {
		return inRepair;
	}

	public OrderStatus5Choice setInRepair(com.tools20022.repository.choice.InRepairStatusReason4Choice inRepair) {
		this.inRepair = Objects.requireNonNull(inRepair);
		return this;
	}

	public PartiallySettledStatus10 getPartiallySettled() {
		return partiallySettled;
	}

	public OrderStatus5Choice setPartiallySettled(PartiallySettledStatus10 partiallySettled) {
		this.partiallySettled = Objects.requireNonNull(partiallySettled);
		return this;
	}
}