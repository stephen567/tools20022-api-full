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
import com.tools20022.repository.choice.BillingMethod1Choice;
import com.tools20022.repository.codeset.ServicePaymentMethod1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection34;
import com.tools20022.repository.msg.BillingPrice1;
import com.tools20022.repository.msg.BillingServiceParameters1;
import com.tools20022.repository.msg.ServiceTaxDesignation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the values used for every line item service in the statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService1#mmServiceDetail
 * BillingService1.mmServiceDetail}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingService1#mmPrice
 * BillingService1.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService1#mmPaymentMethod
 * BillingService1.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService1#mmOriginalChargePrice
 * BillingService1.mmOriginalChargePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService1#mmOriginalChargeSettlementAmount
 * BillingService1.mmOriginalChargeSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService1#mmBalanceRequiredAccountAmount
 * BillingService1.mmBalanceRequiredAccountAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService1#mmTaxDesignation
 * BillingService1.mmTaxDesignation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService1#mmTaxCalculation
 * BillingService1.mmTaxCalculation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingService1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the values used for every line item service in the statement."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingService2
 * BillingService2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingService1", propOrder = {"serviceDetail", "price", "paymentMethod", "originalChargePrice", "originalChargeSettlementAmount", "balanceRequiredAccountAmount", "taxDesignation", "taxCalculation"})
public class BillingService1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SvcDtl", required = true)
	protected BillingServiceParameters1 serviceDetail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters1
	 * BillingServiceParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1
	 * BillingService1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcDtl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies further detailed values for this service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmServiceDetail
	 * BillingService2.mmServiceDetail}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingService1, BillingServiceParameters1> mmServiceDetail = new MMMessageAttribute<BillingService1, BillingServiceParameters1>() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingService1.mmObject();
			isDerived = false;
			xmlTag = "SvcDtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceDetail";
			definition = "Specifies further detailed values for this service.";
			nextVersions_lazy = () -> Arrays.asList(BillingService2.mmServiceDetail);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BillingServiceParameters1.mmObject();
		}

		@Override
		public BillingServiceParameters1 getValue(BillingService1 obj) {
			return obj.getServiceDetail();
		}

		@Override
		public void setValue(BillingService1 obj, BillingServiceParameters1 value) {
			obj.setServiceDetail(value);
		}
	};
	@XmlElement(name = "Pric")
	protected BillingPrice1 price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingPrice1
	 * BillingPrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1
	 * BillingService1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price applied to the service, expressed in the pricing currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#mmPrice
	 * BillingService2.mmPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingService1, Optional<BillingPrice1>> mmPrice = new MMMessageAssociationEnd<BillingService1, Optional<BillingPrice1>>() {
		{
			businessElementTrace_lazy = () -> Product.mmUnitPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingService1.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Price applied to the service, expressed in the pricing currency.";
			nextVersions_lazy = () -> Arrays.asList(BillingService2.mmPrice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BillingPrice1.mmObject();
		}

		@Override
		public Optional<BillingPrice1> getValue(BillingService1 obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(BillingService1 obj, Optional<BillingPrice1> value) {
			obj.setPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtMtd", required = true)
	protected ServicePaymentMethod1Code paymentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code
	 * ServicePaymentMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmPaymentMethod
	 * CashAccountService.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1
	 * BillingService1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code identifying the disposition of the calculated charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmPaymentMethod
	 * BillingService2.mmPaymentMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingService1, ServicePaymentMethod1Code> mmPaymentMethod = new MMMessageAttribute<BillingService1, ServicePaymentMethod1Code>() {
		{
			businessElementTrace_lazy = () -> CashAccountService.mmPaymentMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingService1.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Code identifying the disposition of the calculated charge.";
			nextVersions_lazy = () -> Arrays.asList(BillingService2.mmPaymentMethod);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServicePaymentMethod1Code.mmObject();
		}

		@Override
		public ServicePaymentMethod1Code getValue(BillingService1 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(BillingService1 obj, ServicePaymentMethod1Code value) {
			obj.setPaymentMethod(value);
		}
	};
	@XmlElement(name = "OrgnlChrgPric", required = true)
	protected AmountAndDirection34 originalChargePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1
	 * BillingService1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlChrgPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalChargePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the calculated charge, expressed in the pricing currency. This value does not include any tax on the service."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmOriginalChargePrice
	 * BillingService2.mmOriginalChargePrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingService1, AmountAndDirection34> mmOriginalChargePrice = new MMMessageAssociationEnd<BillingService1, AmountAndDirection34>() {
		{
			businessElementTrace_lazy = () -> Product.mmUnitPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingService1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlChrgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalChargePrice";
			definition = "Amount of the calculated charge, expressed in the pricing currency. This value does not include any tax on the service.";
			nextVersions_lazy = () -> Arrays.asList(BillingService2.mmOriginalChargePrice);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public AmountAndDirection34 getValue(BillingService1 obj) {
			return obj.getOriginalChargePrice();
		}

		@Override
		public void setValue(BillingService1 obj, AmountAndDirection34 value) {
			obj.setOriginalChargePrice(value);
		}
	};
	@XmlElement(name = "OrgnlChrgSttlmAmt")
	protected AmountAndDirection34 originalChargeSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Service#mmAmount
	 * Service.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1
	 * BillingService1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlChrgSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalChargeSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the calculated charge, expressed in the settlement currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmOriginalChargeSettlementAmount
	 * BillingService2.mmOriginalChargeSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingService1, Optional<AmountAndDirection34>> mmOriginalChargeSettlementAmount = new MMMessageAssociationEnd<BillingService1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> Service.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingService1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlChrgSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalChargeSettlementAmount";
			definition = "Amount of the calculated charge, expressed in the settlement currency.";
			nextVersions_lazy = () -> Arrays.asList(BillingService2.mmOriginalChargeSettlementAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingService1 obj) {
			return obj.getOriginalChargeSettlementAmount();
		}

		@Override
		public void setValue(BillingService1 obj, Optional<AmountAndDirection34> value) {
			obj.setOriginalChargeSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "BalReqrdAcctAmt")
	protected AmountAndDirection34 balanceRequiredAccountAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAmount
	 * CashBalance.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1
	 * BillingService1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalReqrdAcctAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceRequiredAccountAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average daily collected balance required to offset a balance compensable service charge, exclusive of taxes, expressed in the account currency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmBalanceRequiredAccountAmount
	 * BillingService2.mmBalanceRequiredAccountAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingService1, Optional<AmountAndDirection34>> mmBalanceRequiredAccountAmount = new MMMessageAssociationEnd<BillingService1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingService1.mmObject();
			isDerived = false;
			xmlTag = "BalReqrdAcctAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceRequiredAccountAmount";
			definition = "Average daily collected balance required to offset a balance compensable service charge, exclusive of taxes, expressed in the account currency.";
			nextVersions_lazy = () -> Arrays.asList(BillingService2.mmBalanceRequiredAccountAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingService1 obj) {
			return obj.getBalanceRequiredAccountAmount();
		}

		@Override
		public void setValue(BillingService1 obj, Optional<AmountAndDirection34> value) {
			obj.setBalanceRequiredAccountAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxDsgnt", required = true)
	protected ServiceTaxDesignation1 taxDesignation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1
	 * ServiceTaxDesignation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1
	 * BillingService1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDsgnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDesignation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the details of the taxable status of a service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmTaxDesignation
	 * BillingService2.mmTaxDesignation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingService1, ServiceTaxDesignation1> mmTaxDesignation = new MMMessageAttribute<BillingService1, ServiceTaxDesignation1>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRecord;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingService1.mmObject();
			isDerived = false;
			xmlTag = "TaxDsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDesignation";
			definition = "Provides the details of the taxable status of a service.";
			nextVersions_lazy = () -> Arrays.asList(BillingService2.mmTaxDesignation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ServiceTaxDesignation1.mmObject();
		}

		@Override
		public ServiceTaxDesignation1 getValue(BillingService1 obj) {
			return obj.getTaxDesignation();
		}

		@Override
		public void setValue(BillingService1 obj, ServiceTaxDesignation1 value) {
			obj.setTaxDesignation(value);
		}
	};
	@XmlElement(name = "TaxClctn")
	protected BillingMethod1Choice taxCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice
	 * BillingMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1
	 * BillingService1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxClctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides tax related values for tax calculation methods A, B or D."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmTaxCalculation
	 * BillingService2.mmTaxCalculation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingService1, Optional<BillingMethod1Choice>> mmTaxCalculation = new MMMessageAttribute<BillingService1, Optional<BillingMethod1Choice>>() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingService1.mmObject();
			isDerived = false;
			xmlTag = "TaxClctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCalculation";
			definition = "Provides tax related values for tax calculation methods A, B or D.";
			nextVersions_lazy = () -> Arrays.asList(BillingService2.mmTaxCalculation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BillingMethod1Choice.mmObject();
		}

		@Override
		public Optional<BillingMethod1Choice> getValue(BillingService1 obj) {
			return obj.getTaxCalculation();
		}

		@Override
		public void setValue(BillingService1 obj, Optional<BillingMethod1Choice> value) {
			obj.setTaxCalculation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingService1.mmServiceDetail, com.tools20022.repository.msg.BillingService1.mmPrice, com.tools20022.repository.msg.BillingService1.mmPaymentMethod,
						com.tools20022.repository.msg.BillingService1.mmOriginalChargePrice, com.tools20022.repository.msg.BillingService1.mmOriginalChargeSettlementAmount,
						com.tools20022.repository.msg.BillingService1.mmBalanceRequiredAccountAmount, com.tools20022.repository.msg.BillingService1.mmTaxDesignation, com.tools20022.repository.msg.BillingService1.mmTaxCalculation);
				trace_lazy = () -> CashAccountService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingService1";
				definition = "Specifies the values used for every line item service in the statement.";
				nextVersions_lazy = () -> Arrays.asList(BillingService2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public BillingServiceParameters1 getServiceDetail() {
		return serviceDetail;
	}

	public BillingService1 setServiceDetail(BillingServiceParameters1 serviceDetail) {
		this.serviceDetail = Objects.requireNonNull(serviceDetail);
		return this;
	}

	public Optional<BillingPrice1> getPrice() {
		return price == null ? Optional.empty() : Optional.of(price);
	}

	public BillingService1 setPrice(BillingPrice1 price) {
		this.price = price;
		return this;
	}

	public ServicePaymentMethod1Code getPaymentMethod() {
		return paymentMethod;
	}

	public BillingService1 setPaymentMethod(ServicePaymentMethod1Code paymentMethod) {
		this.paymentMethod = Objects.requireNonNull(paymentMethod);
		return this;
	}

	public AmountAndDirection34 getOriginalChargePrice() {
		return originalChargePrice;
	}

	public BillingService1 setOriginalChargePrice(AmountAndDirection34 originalChargePrice) {
		this.originalChargePrice = Objects.requireNonNull(originalChargePrice);
		return this;
	}

	public Optional<AmountAndDirection34> getOriginalChargeSettlementAmount() {
		return originalChargeSettlementAmount == null ? Optional.empty() : Optional.of(originalChargeSettlementAmount);
	}

	public BillingService1 setOriginalChargeSettlementAmount(AmountAndDirection34 originalChargeSettlementAmount) {
		this.originalChargeSettlementAmount = originalChargeSettlementAmount;
		return this;
	}

	public Optional<AmountAndDirection34> getBalanceRequiredAccountAmount() {
		return balanceRequiredAccountAmount == null ? Optional.empty() : Optional.of(balanceRequiredAccountAmount);
	}

	public BillingService1 setBalanceRequiredAccountAmount(AmountAndDirection34 balanceRequiredAccountAmount) {
		this.balanceRequiredAccountAmount = balanceRequiredAccountAmount;
		return this;
	}

	public ServiceTaxDesignation1 getTaxDesignation() {
		return taxDesignation;
	}

	public BillingService1 setTaxDesignation(ServiceTaxDesignation1 taxDesignation) {
		this.taxDesignation = Objects.requireNonNull(taxDesignation);
		return this;
	}

	public Optional<BillingMethod1Choice> getTaxCalculation() {
		return taxCalculation == null ? Optional.empty() : Optional.of(taxCalculation);
	}

	public BillingService1 setTaxCalculation(BillingMethod1Choice taxCalculation) {
		this.taxCalculation = taxCalculation;
		return this;
	}
}