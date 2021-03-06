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
import com.tools20022.repository.choice.ReturnReason1Choice;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification14;
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
 * Further information on the return reason of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3#mmReturnOriginator
 * ReturnReasonInformation3.mmReturnOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3#mmReturnReason
 * ReturnReasonInformation3.mmReturnReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3#mmAdditionalReturnReasonInformation
 * ReturnReasonInformation3.mmAdditionalReturnReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentStatus
 * PaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReturnReasonInformation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Further information on the return reason of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnReasonRule#forReturnReasonInformation3
 * ConstraintReturnReasonRule.forReturnReasonInformation3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReturnReasonInformation3", propOrder = {"returnOriginator", "returnReason", "additionalReturnReasonInformation"})
public class ReturnReasonInformation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RtrOrgtr", required = true)
	protected PartyIdentification14 returnOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification14
	 * PartyIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3
	 * ReturnReasonInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrOrgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party issuing the return."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReturnReasonInformation3, PartyIdentification14> mmReturnOriginator = new MMMessageAssociationEnd<ReturnReasonInformation3, PartyIdentification14>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReturnReasonInformation3.mmObject();
			isDerived = false;
			xmlTag = "RtrOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOriginator";
			definition = "Party issuing the return.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification14.mmObject();
		}

		@Override
		public PartyIdentification14 getValue(ReturnReasonInformation3 obj) {
			return obj.getReturnOriginator();
		}

		@Override
		public void setValue(ReturnReasonInformation3 obj, PartyIdentification14 value) {
			obj.setReturnOriginator(value);
		}
	};
	@XmlElement(name = "RtrRsn", required = true)
	protected ReturnReason1Choice returnReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ReturnReason1Choice
	 * ReturnReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3
	 * ReturnReasonInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the return."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReturnReasonInformation3, ReturnReason1Choice> mmReturnReason = new MMMessageAssociationEnd<ReturnReasonInformation3, ReturnReason1Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReturnReasonInformation3.mmObject();
			isDerived = false;
			xmlTag = "RtrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnReason";
			definition = "Specifies the reason for the return.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReturnReason1Choice.mmObject();
		}

		@Override
		public ReturnReason1Choice getValue(ReturnReasonInformation3 obj) {
			return obj.getReturnReason();
		}

		@Override
		public void setValue(ReturnReasonInformation3 obj, ReturnReason1Choice value) {
			obj.setReturnReason(value);
		}
	};
	@XmlElement(name = "AddtlRtrRsnInf")
	protected List<Max105Text> additionalReturnReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3
	 * ReturnReasonInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRtrRsnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReturnReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the return reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReturnReasonInformation3, List<Max105Text>> mmAdditionalReturnReasonInformation = new MMMessageAttribute<ReturnReasonInformation3, List<Max105Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReturnReasonInformation3.mmObject();
			isDerived = false;
			xmlTag = "AddtlRtrRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReturnReasonInformation";
			definition = "Further details on the return reason.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public List<Max105Text> getValue(ReturnReasonInformation3 obj) {
			return obj.getAdditionalReturnReasonInformation();
		}

		@Override
		public void setValue(ReturnReasonInformation3 obj, List<Max105Text> value) {
			obj.setAdditionalReturnReasonInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReturnReasonInformation3.mmReturnOriginator, com.tools20022.repository.msg.ReturnReasonInformation3.mmReturnReason,
						com.tools20022.repository.msg.ReturnReasonInformation3.mmAdditionalReturnReasonInformation);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnReasonRule.forReturnReasonInformation3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReturnReasonInformation3";
				definition = "Further information on the return reason of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification14 getReturnOriginator() {
		return returnOriginator;
	}

	public ReturnReasonInformation3 setReturnOriginator(PartyIdentification14 returnOriginator) {
		this.returnOriginator = Objects.requireNonNull(returnOriginator);
		return this;
	}

	public ReturnReason1Choice getReturnReason() {
		return returnReason;
	}

	public ReturnReasonInformation3 setReturnReason(ReturnReason1Choice returnReason) {
		this.returnReason = Objects.requireNonNull(returnReason);
		return this;
	}

	public List<Max105Text> getAdditionalReturnReasonInformation() {
		return additionalReturnReasonInformation == null ? additionalReturnReasonInformation = new ArrayList<>() : additionalReturnReasonInformation;
	}

	public ReturnReasonInformation3 setAdditionalReturnReasonInformation(List<Max105Text> additionalReturnReasonInformation) {
		this.additionalReturnReasonInformation = Objects.requireNonNull(additionalReturnReasonInformation);
		return this;
	}
}