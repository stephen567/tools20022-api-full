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
import com.tools20022.repository.choice.ReturnReason5Choice;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.BankTransaction;
import com.tools20022.repository.entity.StatusOriginator;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BankTransactionCodeStructure4;
import com.tools20022.repository.msg.PartyIdentification125;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the reason of the return of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason3#mmOriginalBankTransactionCode
 * PaymentReturnReason3.mmOriginalBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason3#mmOriginator
 * PaymentReturnReason3.mmOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason3#mmReason
 * PaymentReturnReason3.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason3#mmAdditionalInformation
 * PaymentReturnReason3.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentReturnReason3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the reason of the return of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnReasonRule#forPaymentReturnReason3
 * ConstraintReturnReasonRule.forPaymentReturnReason3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2
 * PaymentReturnReason2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentReturnReason3", propOrder = {"originalBankTransactionCode", "originator", "reason", "additionalInformation"})
public class PaymentReturnReason3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlBkTxCd")
	protected BankTransactionCodeStructure4 originalBankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlBkTxCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalBankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank transaction code included in the original entry for the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2#mmOriginalBankTransactionCode
	 * PaymentReturnReason2.mmOriginalBankTransactionCode}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentReturnReason3, Optional<BankTransactionCodeStructure4>> mmOriginalBankTransactionCode = new MMMessageAssociationEnd<PaymentReturnReason3, Optional<BankTransactionCodeStructure4>>() {
		{
			businessComponentTrace_lazy = () -> BankTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnReason3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlBkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalBankTransactionCode";
			definition = "Bank transaction code included in the original entry for the transaction.";
			previousVersion_lazy = () -> PaymentReturnReason2.mmOriginalBankTransactionCode;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure4.mmObject();
		}

		@Override
		public Optional<BankTransactionCodeStructure4> getValue(PaymentReturnReason3 obj) {
			return obj.getOriginalBankTransactionCode();
		}

		@Override
		public void setValue(PaymentReturnReason3 obj, Optional<BankTransactionCodeStructure4> value) {
			obj.setOriginalBankTransactionCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Orgtr")
	protected PartyIdentification125 originator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusOriginator
	 * StatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Orgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Originator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that issues the return."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2#mmOriginator
	 * PaymentReturnReason2.mmOriginator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentReturnReason3, Optional<PartyIdentification125>> mmOriginator = new MMMessageAssociationEnd<PaymentReturnReason3, Optional<PartyIdentification125>>() {
		{
			businessComponentTrace_lazy = () -> StatusOriginator.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnReason3.mmObject();
			isDerived = false;
			xmlTag = "Orgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Originator";
			definition = "Party that issues the return.";
			previousVersion_lazy = () -> PaymentReturnReason2.mmOriginator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public Optional<PartyIdentification125> getValue(PaymentReturnReason3 obj) {
			return obj.getOriginator();
		}

		@Override
		public void setValue(PaymentReturnReason3 obj, Optional<PartyIdentification125> value) {
			obj.setOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected ReturnReason5Choice reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ReturnReason5Choice
	 * ReturnReason5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the return."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2#mmReason
	 * PaymentReturnReason2.mmReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentReturnReason3, Optional<ReturnReason5Choice>> mmReason = new MMMessageAssociationEnd<PaymentReturnReason3, Optional<ReturnReason5Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnReason3.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason for the return.";
			previousVersion_lazy = () -> PaymentReturnReason2.mmReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReturnReason5Choice.mmObject();
		}

		@Override
		public Optional<ReturnReason5Choice> getValue(PaymentReturnReason3 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(PaymentReturnReason3 obj, Optional<ReturnReason5Choice> value) {
			obj.setReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max105Text> additionalInformation;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the return reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2#mmAdditionalInformation
	 * PaymentReturnReason2.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnReason3, List<Max105Text>> mmAdditionalInformation = new MMMessageAttribute<PaymentReturnReason3, List<Max105Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnReason3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details on the return reason.";
			previousVersion_lazy = () -> PaymentReturnReason2.mmAdditionalInformation;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public List<Max105Text> getValue(PaymentReturnReason3 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(PaymentReturnReason3 obj, List<Max105Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentReturnReason3.mmOriginalBankTransactionCode, com.tools20022.repository.msg.PaymentReturnReason3.mmOriginator,
						com.tools20022.repository.msg.PaymentReturnReason3.mmReason, com.tools20022.repository.msg.PaymentReturnReason3.mmAdditionalInformation);
				trace_lazy = () -> StatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnReasonRule.forPaymentReturnReason3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentReturnReason3";
				definition = "Provides further details on the reason of the return of the transaction.";
				previousVersion_lazy = () -> PaymentReturnReason2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BankTransactionCodeStructure4> getOriginalBankTransactionCode() {
		return originalBankTransactionCode == null ? Optional.empty() : Optional.of(originalBankTransactionCode);
	}

	public PaymentReturnReason3 setOriginalBankTransactionCode(BankTransactionCodeStructure4 originalBankTransactionCode) {
		this.originalBankTransactionCode = originalBankTransactionCode;
		return this;
	}

	public Optional<PartyIdentification125> getOriginator() {
		return originator == null ? Optional.empty() : Optional.of(originator);
	}

	public PaymentReturnReason3 setOriginator(PartyIdentification125 originator) {
		this.originator = originator;
		return this;
	}

	public Optional<ReturnReason5Choice> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public PaymentReturnReason3 setReason(ReturnReason5Choice reason) {
		this.reason = reason;
		return this;
	}

	public List<Max105Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public PaymentReturnReason3 setAdditionalInformation(List<Max105Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}