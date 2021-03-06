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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.OrderStatus5Code;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
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
 * Choice of status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmStatus
 * OrderStatus1Choice.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmCancelled
 * OrderStatus1Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmConditionallyAccepted
 * OrderStatus1Choice.mmConditionallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmRejected
 * OrderStatus1Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmSuspended
 * OrderStatus1Choice.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmPartiallySettled
 * OrderStatus1Choice.mmPartiallySettled}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderStatus1Choice", propOrder = {"status", "cancelled", "conditionallyAccepted", "rejected", "suspended", "partiallySettled"})
public class OrderStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected OrderStatus5Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus5Code
	 * OrderStatus5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmOrderStatus
	 * SecuritiesOrderStatus.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice
	 * OrderStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderStatus1Choice, OrderStatus5Code> mmStatus = new MMMessageAttribute<OrderStatus1Choice, OrderStatus5Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmOrderStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatus5Code.mmObject();
		}

		@Override
		public OrderStatus5Code getValue(OrderStatus1Choice obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(OrderStatus1Choice obj, OrderStatus5Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatusReason1Choice cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancelledStatusReason1Choice
	 * CancelledStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice
	 * OrderStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the individual order is cancelled. This status is used for an order that has been accepted or that has been entered in an order book but that cannot be executed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatus1Choice, CancelledStatusReason1Choice> mmCancelled = new MMMessageAssociationEnd<OrderStatus1Choice, CancelledStatusReason1Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of the individual order is cancelled. This status is used for an order that has been accepted or that has been entered in an order book but that cannot be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatusReason1Choice.mmObject();
		}

		@Override
		public CancelledStatusReason1Choice getValue(OrderStatus1Choice obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(OrderStatus1Choice obj, CancelledStatusReason1Choice value) {
			obj.setCancelled(value);
		}
	};
	@XmlElement(name = "CondlyAccptd", required = true)
	protected List<ConditionallyAcceptedStatusReason1Choice> conditionallyAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice
	 * ConditionallyAcceptedStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
	 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice
	 * OrderStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlyAccptd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order is conditionally accepted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatus1Choice, List<ConditionallyAcceptedStatusReason1Choice>> mmConditionallyAccepted = new MMMessageAssociationEnd<OrderStatus1Choice, List<ConditionallyAcceptedStatusReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConditionallyAcceptedStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "CondlyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyAccepted";
			definition = "Status of the order is conditionally accepted.";
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ConditionallyAcceptedStatusReason1Choice.mmObject();
		}

		@Override
		public List<ConditionallyAcceptedStatusReason1Choice> getValue(OrderStatus1Choice obj) {
			return obj.getConditionallyAccepted();
		}

		@Override
		public void setValue(OrderStatus1Choice obj, List<ConditionallyAcceptedStatusReason1Choice> value) {
			obj.setConditionallyAccepted(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected List<RejectedStatusReason1Choice> rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason1Choice
	 * RejectedStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice
	 * OrderStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the order is rejected. This status is used for an order that has not been accepted or entered in an order book."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatus1Choice, List<RejectedStatusReason1Choice>> mmRejected = new MMMessageAssociationEnd<OrderStatus1Choice, List<RejectedStatusReason1Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrderStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the order is rejected. This status is used for an order that has not been accepted or entered in an order book.";
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatusReason1Choice.mmObject();
		}

		@Override
		public List<RejectedStatusReason1Choice> getValue(OrderStatus1Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(OrderStatus1Choice obj, List<RejectedStatusReason1Choice> value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Sspd", required = true)
	protected SuspendedStatusReasonChoice suspended;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReasonChoice
	 * SuspendedStatusReasonChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSuspendedStatusReason
	 * SecuritiesOrderStatus.mmSuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice
	 * OrderStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sspd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order is suspended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatus1Choice, SuspendedStatusReasonChoice> mmSuspended = new MMMessageAssociationEnd<OrderStatus1Choice, SuspendedStatusReasonChoice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Status of the order is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SuspendedStatusReasonChoice.mmObject();
		}

		@Override
		public SuspendedStatusReasonChoice getValue(OrderStatus1Choice obj) {
			return obj.getSuspended();
		}

		@Override
		public void setValue(OrderStatus1Choice obj, SuspendedStatusReasonChoice value) {
			obj.setSuspended(value);
		}
	};
	@XmlElement(name = "PrtlySttld", required = true)
	protected PartiallySettledStatus2 partiallySettled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartiallySettledStatus2
	 * PartiallySettledStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmPartiallySettledStatusReason
	 * SecuritiesOrderStatus.mmPartiallySettledStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice
	 * OrderStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlySttld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order is partially settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatus1Choice, PartiallySettledStatus2> mmPartiallySettled = new MMMessageAssociationEnd<OrderStatus1Choice, PartiallySettledStatus2>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmPartiallySettledStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.OrderStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtlySttld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySettled";
			definition = "Status of the order is partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartiallySettledStatus2.mmObject();
		}

		@Override
		public PartiallySettledStatus2 getValue(OrderStatus1Choice obj) {
			return obj.getPartiallySettled();
		}

		@Override
		public void setValue(OrderStatus1Choice obj, PartiallySettledStatus2 value) {
			obj.setPartiallySettled(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OrderStatus1Choice.mmStatus, com.tools20022.repository.choice.OrderStatus1Choice.mmCancelled,
						com.tools20022.repository.choice.OrderStatus1Choice.mmConditionallyAccepted, com.tools20022.repository.choice.OrderStatus1Choice.mmRejected, com.tools20022.repository.choice.OrderStatus1Choice.mmSuspended,
						com.tools20022.repository.choice.OrderStatus1Choice.mmPartiallySettled);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrderStatus1Choice";
				definition = "Choice of status.";
			}
		});
		return mmObject_lazy.get();
	}

	public OrderStatus5Code getStatus() {
		return status;
	}

	public OrderStatus1Choice setStatus(OrderStatus5Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public CancelledStatusReason1Choice getCancelled() {
		return cancelled;
	}

	public OrderStatus1Choice setCancelled(CancelledStatusReason1Choice cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public List<ConditionallyAcceptedStatusReason1Choice> getConditionallyAccepted() {
		return conditionallyAccepted == null ? conditionallyAccepted = new ArrayList<>() : conditionallyAccepted;
	}

	public OrderStatus1Choice setConditionallyAccepted(List<ConditionallyAcceptedStatusReason1Choice> conditionallyAccepted) {
		this.conditionallyAccepted = Objects.requireNonNull(conditionallyAccepted);
		return this;
	}

	public List<RejectedStatusReason1Choice> getRejected() {
		return rejected == null ? rejected = new ArrayList<>() : rejected;
	}

	public OrderStatus1Choice setRejected(List<RejectedStatusReason1Choice> rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public SuspendedStatusReasonChoice getSuspended() {
		return suspended;
	}

	public OrderStatus1Choice setSuspended(SuspendedStatusReasonChoice suspended) {
		this.suspended = Objects.requireNonNull(suspended);
		return this;
	}

	public PartiallySettledStatus2 getPartiallySettled() {
		return partiallySettled;
	}

	public OrderStatus1Choice setPartiallySettled(PartiallySettledStatus2 partiallySettled) {
		this.partiallySettled = Objects.requireNonNull(partiallySettled);
		return this;
	}
}