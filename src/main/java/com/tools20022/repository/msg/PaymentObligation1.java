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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.FinancialInstitution;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BICIdentification1;
import com.tools20022.repository.msg.PaymentTerms2;
import com.tools20022.repository.msg.SettlementTerms2;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment obligation contracted between two financial institutions related to
 * the financing of a commercial transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#AmountOrPercentageRule
 * PaymentObligation1.AmountOrPercentageRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmObligorBank
 * PaymentObligation1.mmObligorBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmRecipientBank
 * PaymentObligation1.mmRecipientBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation1#mmAmount
 * PaymentObligation1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmPercentage
 * PaymentObligation1.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmChargesAmount
 * PaymentObligation1.mmChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmChargesPercentage
 * PaymentObligation1.mmChargesPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmExpiryDate
 * PaymentObligation1.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmApplicableLaw
 * PaymentObligation1.mmApplicableLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmPaymentTerms
 * PaymentObligation1.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmSettlementTerms
 * PaymentObligation1.mmSettlementTerms}</li>
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
 * "PaymentObligation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment obligation contracted between two financial institutions related to the financing of a commercial transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation2
 * PaymentObligation2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentObligation1", propOrder = {"obligorBank", "recipientBank", "amount", "percentage", "chargesAmount", "chargesPercentage", "expiryDate", "applicableLaw", "paymentTerms", "settlementTerms"})
public class PaymentObligation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OblgrBk", required = true)
	protected BICIdentification1 obligorBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgrBk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligorBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank that has to pay under the obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmObligorBank
	 * PaymentObligation2.mmObligorBank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation1, BICIdentification1> mmObligorBank = new MMMessageAssociationEnd<PaymentObligation1, BICIdentification1>() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			isDerived = false;
			xmlTag = "OblgrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligorBank";
			definition = "Bank that has to pay under the obligation.";
			nextVersions_lazy = () -> Arrays.asList(PaymentObligation2.mmObligorBank);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(PaymentObligation1 obj) {
			return obj.getObligorBank();
		}

		@Override
		public void setValue(PaymentObligation1 obj, BICIdentification1 value) {
			obj.setObligorBank(value);
		}
	};
	@XmlElement(name = "RcptBk", required = true)
	protected BICIdentification1 recipientBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptBk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank that will be paid under the obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmRecipientBank
	 * PaymentObligation2.mmRecipientBank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation1, BICIdentification1> mmRecipientBank = new MMMessageAssociationEnd<PaymentObligation1, BICIdentification1>() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			isDerived = false;
			xmlTag = "RcptBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientBank";
			definition = "Bank that will be paid under the obligation.";
			nextVersions_lazy = () -> Arrays.asList(PaymentObligation2.mmRecipientBank);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(PaymentObligation1 obj) {
			return obj.getRecipientBank();
		}

		@Override
		public void setValue(PaymentObligation1 obj, BICIdentification1 value) {
			obj.setRecipientBank(value);
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmMaximumAmount
	 * PaymentObligation.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum amount that will be paid under the obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentObligation1, CurrencyAndAmount> mmAmount = new MMMessageAttribute<PaymentObligation1, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmMaximumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Maximum amount that will be paid under the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(PaymentObligation1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(PaymentObligation1 obj, CurrencyAndAmount value) {
			obj.setAmount(value);
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPercentage
	 * PaymentObligation.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pctg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that will be paid under the obligation, expressed as a percentage of the purchase order net amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentObligation1, PercentageRate> mmPercentage = new MMMessageAttribute<PaymentObligation1, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			isDerived = false;
			xmlTag = "Pctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			definition = "Maximum amount that will be paid under the obligation, expressed as a percentage of the purchase order net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(PaymentObligation1 obj) {
			return obj.getPercentage();
		}

		@Override
		public void setValue(PaymentObligation1 obj, PercentageRate value) {
			obj.setPercentage(value);
		}
	};
	@XmlElement(name = "ChrgsAmt")
	protected CurrencyAndAmount chargesAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the charges taken by the obligor bank."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentObligation1, Optional<CurrencyAndAmount>> mmChargesAmount = new MMMessageAttribute<PaymentObligation1, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAmount";
			definition = "Amount of the charges taken by the obligor bank.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(PaymentObligation1 obj) {
			return obj.getChargesAmount();
		}

		@Override
		public void setValue(PaymentObligation1 obj, Optional<CurrencyAndAmount> value) {
			obj.setChargesAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsPctg")
	protected PercentageRate chargesPercentage;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsPctg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the charges expressed as a percentage of the amount paid by the obligor bank."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentObligation1, Optional<PercentageRate>> mmChargesPercentage = new MMMessageAttribute<PaymentObligation1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			isDerived = false;
			xmlTag = "ChrgsPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesPercentage";
			definition = "Amount of the charges expressed as a percentage of the amount paid by the obligor bank.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(PaymentObligation1 obj) {
			return obj.getChargesPercentage();
		}

		@Override
		public void setValue(PaymentObligation1 obj, Optional<PercentageRate> value) {
			obj.setChargesPercentage(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt", required = true)
	protected ISODate expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExpiryDate
	 * PaymentObligation.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the obligation will expire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmExpiryDate
	 * PaymentObligation2.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentObligation1, ISODate> mmExpiryDate = new MMMessageAttribute<PaymentObligation1, ISODate>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the obligation will expire.";
			nextVersions_lazy = () -> Arrays.asList(PaymentObligation2.mmExpiryDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(PaymentObligation1 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(PaymentObligation1 obj, ISODate value) {
			obj.setExpiryDate(value);
		}
	};
	@XmlElement(name = "AplblLaw")
	protected CountryCode applicableLaw;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmApplicableLaw
	 * PaymentObligation.mmApplicableLaw}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AplblLaw"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of which the law governs the bank payment obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmApplicableLaw
	 * PaymentObligation2.mmApplicableLaw}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentObligation1, Optional<CountryCode>> mmApplicableLaw = new MMMessageAttribute<PaymentObligation1, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmApplicableLaw;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			isDerived = false;
			xmlTag = "AplblLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableLaw";
			definition = "Country of which the law governs the bank payment obligation.";
			nextVersions_lazy = () -> Arrays.asList(PaymentObligation2.mmApplicableLaw);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(PaymentObligation1 obj) {
			return obj.getApplicableLaw();
		}

		@Override
		public void setValue(PaymentObligation1 obj, Optional<CountryCode> value) {
			obj.setApplicableLaw(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtTerms")
	protected List<PaymentTerms2> paymentTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTerms2
	 * PaymentTerms2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTerms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmPaymentTerms
	 * PaymentObligation2.mmPaymentTerms}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation1, List<PaymentTerms2>> mmPaymentTerms = new MMMessageAssociationEnd<PaymentObligation1, List<PaymentTerms2>>() {
		{
			businessComponentTrace_lazy = () -> PaymentObligation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentObligation2.mmPaymentTerms);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTerms2.mmObject();
		}

		@Override
		public List<PaymentTerms2> getValue(PaymentObligation1 obj) {
			return obj.getPaymentTerms();
		}

		@Override
		public void setValue(PaymentObligation1 obj, List<PaymentTerms2> value) {
			obj.setPaymentTerms(value);
		}
	};
	@XmlElement(name = "SttlmTerms")
	protected SettlementTerms2 settlementTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTerms2
	 * SettlementTerms2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTerms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction between two clearing agents stipulating the cash transfer characteristics between the two parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmSettlementTerms
	 * PaymentObligation2.mmSettlementTerms}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation1, Optional<SettlementTerms2>> mmSettlementTerms = new MMMessageAssociationEnd<PaymentObligation1, Optional<SettlementTerms2>>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			isDerived = false;
			xmlTag = "SttlmTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTerms";
			definition = "Instruction between two clearing agents stipulating the cash transfer characteristics between the two parties.";
			nextVersions_lazy = () -> Arrays.asList(PaymentObligation2.mmSettlementTerms);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTerms2.mmObject();
		}

		@Override
		public Optional<SettlementTerms2> getValue(PaymentObligation1 obj) {
			return obj.getSettlementTerms();
		}

		@Override
		public void setValue(PaymentObligation1 obj, Optional<SettlementTerms2> value) {
			obj.setSettlementTerms(value.orElse(null));
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmAmount
	 * PaymentObligation1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmPercentage
	 * PaymentObligation1.mmPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOrPercentageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor AmountOrPercentageRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountOrPercentageRule";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation1.mmAmount, com.tools20022.repository.msg.PaymentObligation1.mmPercentage);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation1.mmObligorBank, com.tools20022.repository.msg.PaymentObligation1.mmRecipientBank,
						com.tools20022.repository.msg.PaymentObligation1.mmAmount, com.tools20022.repository.msg.PaymentObligation1.mmPercentage, com.tools20022.repository.msg.PaymentObligation1.mmChargesAmount,
						com.tools20022.repository.msg.PaymentObligation1.mmChargesPercentage, com.tools20022.repository.msg.PaymentObligation1.mmExpiryDate, com.tools20022.repository.msg.PaymentObligation1.mmApplicableLaw,
						com.tools20022.repository.msg.PaymentObligation1.mmPaymentTerms, com.tools20022.repository.msg.PaymentObligation1.mmSettlementTerms);
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
				name = "PaymentObligation1";
				definition = "Payment obligation contracted between two financial institutions related to the financing of a commercial transaction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentObligation2.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation1.AmountOrPercentageRule);
			}
		});
		return mmObject_lazy.get();
	}

	public BICIdentification1 getObligorBank() {
		return obligorBank;
	}

	public PaymentObligation1 setObligorBank(BICIdentification1 obligorBank) {
		this.obligorBank = Objects.requireNonNull(obligorBank);
		return this;
	}

	public BICIdentification1 getRecipientBank() {
		return recipientBank;
	}

	public PaymentObligation1 setRecipientBank(BICIdentification1 recipientBank) {
		this.recipientBank = Objects.requireNonNull(recipientBank);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public PaymentObligation1 setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public PaymentObligation1 setPercentage(PercentageRate percentage) {
		this.percentage = Objects.requireNonNull(percentage);
		return this;
	}

	public Optional<CurrencyAndAmount> getChargesAmount() {
		return chargesAmount == null ? Optional.empty() : Optional.of(chargesAmount);
	}

	public PaymentObligation1 setChargesAmount(CurrencyAndAmount chargesAmount) {
		this.chargesAmount = chargesAmount;
		return this;
	}

	public Optional<PercentageRate> getChargesPercentage() {
		return chargesPercentage == null ? Optional.empty() : Optional.of(chargesPercentage);
	}

	public PaymentObligation1 setChargesPercentage(PercentageRate chargesPercentage) {
		this.chargesPercentage = chargesPercentage;
		return this;
	}

	public ISODate getExpiryDate() {
		return expiryDate;
	}

	public PaymentObligation1 setExpiryDate(ISODate expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public Optional<CountryCode> getApplicableLaw() {
		return applicableLaw == null ? Optional.empty() : Optional.of(applicableLaw);
	}

	public PaymentObligation1 setApplicableLaw(CountryCode applicableLaw) {
		this.applicableLaw = applicableLaw;
		return this;
	}

	public List<PaymentTerms2> getPaymentTerms() {
		return paymentTerms == null ? paymentTerms = new ArrayList<>() : paymentTerms;
	}

	public PaymentObligation1 setPaymentTerms(List<PaymentTerms2> paymentTerms) {
		this.paymentTerms = Objects.requireNonNull(paymentTerms);
		return this;
	}

	public Optional<SettlementTerms2> getSettlementTerms() {
		return settlementTerms == null ? Optional.empty() : Optional.of(settlementTerms);
	}

	public PaymentObligation1 setSettlementTerms(SettlementTerms2 settlementTerms) {
		this.settlementTerms = settlementTerms;
		return this;
	}
}