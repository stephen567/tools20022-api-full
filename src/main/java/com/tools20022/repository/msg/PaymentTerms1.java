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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.PaymentTerms;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentPeriod1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the payment terms of the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms1#PercentageOrAmountRule
 * PaymentTerms1.PercentageOrAmountRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms1#OtherPaymentTermsOrPaymentCodeRule
 * PaymentTerms1.OtherPaymentTermsOrPaymentCodeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms1#mmOtherPaymentTerms
 * PaymentTerms1.mmOtherPaymentTerms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms1#mmPaymentCode
 * PaymentTerms1.mmPaymentCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms1#mmPercentage
 * PaymentTerms1.mmPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms1#mmAmount
 * PaymentTerms1.mmAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTerms1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment terms of the underlying transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTerms1", propOrder = {"otherPaymentTerms", "paymentCode", "percentage", "amount"})
public class PaymentTerms1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OthrPmtTerms", required = true)
	protected Max140Text otherPaymentTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentTerms
	 * PaymentObligation.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1 PaymentTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPmtTerms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies payment terms not present in a code list."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerms1, Max140Text> mmOtherPaymentTerms = new MMMessageAttribute<PaymentTerms1, Max140Text>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentTerms;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms1.mmObject();
			isDerived = false;
			xmlTag = "OthrPmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPaymentTerms";
			definition = "Specifies payment terms not present in a code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(PaymentTerms1 obj) {
			return obj.getOtherPaymentTerms();
		}

		@Override
		public void setValue(PaymentTerms1 obj, Max140Text value) {
			obj.setOtherPaymentTerms(value);
		}
	};
	@XmlElement(name = "PmtCd", required = true)
	protected PaymentPeriod1 paymentCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentPeriod1
	 * PaymentPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentTerms
	 * PaymentObligation.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1 PaymentTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the payment period in coded form and a number of days."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTerms1, PaymentPeriod1> mmPaymentCode = new MMMessageAssociationEnd<PaymentTerms1, PaymentPeriod1>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentTerms;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms1.mmObject();
			isDerived = false;
			xmlTag = "PmtCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCode";
			definition = "Specifies the payment period in coded form and a number of days.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentPeriod1.mmObject();
		}

		@Override
		public PaymentPeriod1 getValue(PaymentTerms1 obj) {
			return obj.getPaymentCode();
		}

		@Override
		public void setValue(PaymentTerms1 obj, PaymentPeriod1 value) {
			obj.setPaymentCode(value);
		}
	};
	@XmlElement(name = "Pctg", required = true)
	protected PercentageRate percentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmPercentage
	 * PaymentTerms.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1 PaymentTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pctg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the payment conditions apply to a percentage of the amount due."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerms1, PercentageRate> mmPercentage = new MMMessageAttribute<PaymentTerms1, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> PaymentTerms.mmPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms1.mmObject();
			isDerived = false;
			xmlTag = "Pctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			definition = "Specifies that the payment conditions apply to a percentage of the amount due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(PaymentTerms1 obj) {
			return obj.getPercentage();
		}

		@Override
		public void setValue(PaymentTerms1 obj, PercentageRate value) {
			obj.setPercentage(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmAmount
	 * PaymentTerms.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1 PaymentTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerms1, CurrencyAndAmount> mmAmount = new MMMessageAttribute<PaymentTerms1, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> PaymentTerms.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(PaymentTerms1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(PaymentTerms1 obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	/**
	 * If Percentage is present, then Amount is not allowed. If Percentage is
	 * not present, then Amount is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1 PaymentTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms1#mmPercentage
	 * PaymentTerms1.mmPercentage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms1#mmAmount
	 * PaymentTerms1.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOrAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Percentage is present, then Amount is not allowed. If Percentage is not present, then Amount is mandatory."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor PercentageOrAmountRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOrAmountRule";
			definition = "If Percentage is present, then Amount is not allowed. If Percentage is not present, then Amount is mandatory.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PaymentTerms1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTerms1.mmPercentage, com.tools20022.repository.msg.PaymentTerms1.mmAmount);
		}
	};
	/**
	 * If OtherPaymentTerms is present, then PaymentCode is not allowed. If
	 * OtherPaymentTerms is not present, then PaymentCode is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1 PaymentTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1#mmOtherPaymentTerms
	 * PaymentTerms1.mmOtherPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1#mmPaymentCode
	 * PaymentTerms1.mmPaymentCode}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPaymentTermsOrPaymentCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherPaymentTerms is present, then PaymentCode is not allowed. If OtherPaymentTerms is not present, then PaymentCode is mandatory."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor OtherPaymentTermsOrPaymentCodeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPaymentTermsOrPaymentCodeRule";
			definition = "If OtherPaymentTerms is present, then PaymentCode is not allowed. If OtherPaymentTerms is not present, then PaymentCode is mandatory.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PaymentTerms1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTerms1.mmOtherPaymentTerms, com.tools20022.repository.msg.PaymentTerms1.mmPaymentCode);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTerms1.mmOtherPaymentTerms, com.tools20022.repository.msg.PaymentTerms1.mmPaymentCode, com.tools20022.repository.msg.PaymentTerms1.mmPercentage,
						com.tools20022.repository.msg.PaymentTerms1.mmAmount);
				trace_lazy = () -> PaymentObligation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PaymentTerms1";
				definition = "Specifies the payment terms of the underlying transaction.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTerms1.PercentageOrAmountRule, com.tools20022.repository.msg.PaymentTerms1.OtherPaymentTermsOrPaymentCodeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getOtherPaymentTerms() {
		return otherPaymentTerms;
	}

	public PaymentTerms1 setOtherPaymentTerms(Max140Text otherPaymentTerms) {
		this.otherPaymentTerms = Objects.requireNonNull(otherPaymentTerms);
		return this;
	}

	public PaymentPeriod1 getPaymentCode() {
		return paymentCode;
	}

	public PaymentTerms1 setPaymentCode(PaymentPeriod1 paymentCode) {
		this.paymentCode = Objects.requireNonNull(paymentCode);
		return this;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public PaymentTerms1 setPercentage(PercentageRate percentage) {
		this.percentage = Objects.requireNonNull(percentage);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public PaymentTerms1 setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}
}