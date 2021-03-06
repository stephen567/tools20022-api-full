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
import com.tools20022.repository.codeset.CardPaymentServiceType2Code;
import com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.ReconciliationTransaction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Product2;
import com.tools20022.repository.msg.TransactionIdentifier1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Individual card transaction entry details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmAdditionalService
 * CardIndividualTransaction1.mmAdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmTransactionCategory
 * CardIndividualTransaction1.mmTransactionCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmSaleReconciliationIdentification
 * CardIndividualTransaction1.mmSaleReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmSaleReferenceNumber
 * CardIndividualTransaction1.mmSaleReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmSequenceNumber
 * CardIndividualTransaction1.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmTransactionIdentification
 * CardIndividualTransaction1.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmProduct
 * CardIndividualTransaction1.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmValidationDate
 * CardIndividualTransaction1.mmValidationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmValidationSequenceNumber
 * CardIndividualTransaction1.mmValidationSequenceNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardIndividualTransaction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Individual card transaction entry details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
 * CardIndividualTransaction2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardIndividualTransaction1", propOrder = {"additionalService", "transactionCategory", "saleReconciliationIdentification", "saleReferenceNumber", "sequenceNumber", "transactionIdentification", "product", "validationDate",
		"validationSequenceNumber"})
public class CardIndividualTransaction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlSvc")
	protected CardPaymentServiceType2Code additionalService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1
	 * CardIndividualTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSvc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service in addition to the main service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmAdditionalService
	 * CardIndividualTransaction2.mmAdditionalService}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction1, Optional<CardPaymentServiceType2Code>> mmAdditionalService = new MMMessageAttribute<CardIndividualTransaction1, Optional<CardPaymentServiceType2Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction1.mmObject();
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service.";
			nextVersions_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmAdditionalService);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}

		@Override
		public Optional<CardPaymentServiceType2Code> getValue(CardIndividualTransaction1 obj) {
			return obj.getAdditionalService();
		}

		@Override
		public void setValue(CardIndividualTransaction1 obj, Optional<CardPaymentServiceType2Code> value) {
			obj.setAdditionalService(value.orElse(null));
		}
	};
	@XmlElement(name = "TxCtgy")
	protected ExternalCardTransactionCategory1Code transactionCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code
	 * ExternalCardTransactionCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmType
	 * Payment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1
	 * CardIndividualTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCtgy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmTransactionCategory
	 * CardIndividualTransaction2.mmTransactionCategory}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction1, Optional<ExternalCardTransactionCategory1Code>> mmTransactionCategory = new MMMessageAttribute<CardIndividualTransaction1, Optional<ExternalCardTransactionCategory1Code>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TxCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCategory";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmTransactionCategory);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalCardTransactionCategory1Code.mmObject();
		}

		@Override
		public Optional<ExternalCardTransactionCategory1Code> getValue(CardIndividualTransaction1 obj) {
			return obj.getTransactionCategory();
		}

		@Override
		public void setValue(CardIndividualTransaction1 obj, Optional<ExternalCardTransactionCategory1Code> value) {
			obj.setTransactionCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "SaleRcncltnId")
	protected Max35Text saleReconciliationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
	 * ReconciliationTransaction.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1
	 * CardIndividualTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRcncltnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the sales reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmSaleReconciliationIdentification
	 * CardIndividualTransaction2.mmSaleReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction1, Optional<Max35Text>> mmSaleReconciliationIdentification = new MMMessageAttribute<CardIndividualTransaction1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction1.mmObject();
			isDerived = false;
			xmlTag = "SaleRcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReconciliationIdentification";
			definition = "Unique identification of the sales reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			nextVersions_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmSaleReconciliationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardIndividualTransaction1 obj) {
			return obj.getSaleReconciliationIdentification();
		}

		@Override
		public void setValue(CardIndividualTransaction1 obj, Optional<Max35Text> value) {
			obj.setSaleReconciliationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SaleRefNb")
	protected Max35Text saleReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1
	 * CardIndividualTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRefNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference of the sales as provided by the merchant."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmSaleReferenceNumber
	 * CardIndividualTransaction2.mmSaleReferenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction1, Optional<Max35Text>> mmSaleReferenceNumber = new MMMessageAttribute<CardIndividualTransaction1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction1.mmObject();
			isDerived = false;
			xmlTag = "SaleRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReferenceNumber";
			definition = "Unique reference of the sales as provided by the merchant.";
			nextVersions_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmSaleReferenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardIndividualTransaction1 obj) {
			return obj.getSaleReferenceNumber();
		}

		@Override
		public void setValue(CardIndividualTransaction1 obj, Optional<Max35Text> value) {
			obj.setSaleReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqNb")
	protected Max35Text sequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1
	 * CardIndividualTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequential number of the card transaction, as assigned by the POI (Point of Interaction). \nUsage: The sequential number is increased incrementally for each transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmSequenceNumber
	 * CardIndividualTransaction2.mmSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction1, Optional<Max35Text>> mmSequenceNumber = new MMMessageAttribute<CardIndividualTransaction1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction1.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequential number of the card transaction, as assigned by the POI (Point of Interaction). \nUsage: The sequential number is increased incrementally for each transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardIndividualTransaction1 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(CardIndividualTransaction1 obj, Optional<Max35Text> value) {
			obj.setSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TxId")
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
	 * CardPaymentAcquiring.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1
	 * CardIndividualTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmTransactionIdentification
	 * CardIndividualTransaction2.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction1, Optional<TransactionIdentifier1>> mmTransactionIdentification = new MMMessageAttribute<CardIndividualTransaction1, Optional<TransactionIdentifier1>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public Optional<TransactionIdentifier1> getValue(CardIndividualTransaction1 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(CardIndividualTransaction1 obj, Optional<TransactionIdentifier1> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Pdct")
	protected Product2 product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Product2 Product2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
	 * CardPayment.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1
	 * CardIndividualTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product purchased with the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmProduct
	 * CardIndividualTransaction2.mmProduct}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardIndividualTransaction1, Optional<Product2>> mmProduct = new MMMessageAssociationEnd<CardIndividualTransaction1, Optional<Product2>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Pdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmProduct);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Product2.mmObject();
		}

		@Override
		public Optional<Product2> getValue(CardIndividualTransaction1 obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(CardIndividualTransaction1 obj, Optional<Product2> value) {
			obj.setProduct(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtnDt")
	protected ISODate validationDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1
	 * CardIndividualTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the deposit was validated by the financial institution that collected the cash."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmValidationDate
	 * CardIndividualTransaction2.mmValidationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction1, Optional<ISODate>> mmValidationDate = new MMMessageAttribute<CardIndividualTransaction1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction1.mmObject();
			isDerived = false;
			xmlTag = "VldtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationDate";
			definition = "Date when the deposit was validated by the financial institution that collected the cash.";
			nextVersions_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmValidationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CardIndividualTransaction1 obj) {
			return obj.getValidationDate();
		}

		@Override
		public void setValue(CardIndividualTransaction1 obj, Optional<ISODate> value) {
			obj.setValidationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtnSeqNb")
	protected Max35Text validationSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1
	 * CardIndividualTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequential number of the validation of the cash deposit.\r\nUsage: The sequential number is increased incrementally for each transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmValidationSequenceNumber
	 * CardIndividualTransaction2.mmValidationSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction1, Optional<Max35Text>> mmValidationSequenceNumber = new MMMessageAttribute<CardIndividualTransaction1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction1.mmObject();
			isDerived = false;
			xmlTag = "VldtnSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationSequenceNumber";
			definition = "Sequential number of the validation of the cash deposit.\r\nUsage: The sequential number is increased incrementally for each transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmValidationSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardIndividualTransaction1 obj) {
			return obj.getValidationSequenceNumber();
		}

		@Override
		public void setValue(CardIndividualTransaction1 obj, Optional<Max35Text> value) {
			obj.setValidationSequenceNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardIndividualTransaction1.mmAdditionalService, com.tools20022.repository.msg.CardIndividualTransaction1.mmTransactionCategory,
						com.tools20022.repository.msg.CardIndividualTransaction1.mmSaleReconciliationIdentification, com.tools20022.repository.msg.CardIndividualTransaction1.mmSaleReferenceNumber,
						com.tools20022.repository.msg.CardIndividualTransaction1.mmSequenceNumber, com.tools20022.repository.msg.CardIndividualTransaction1.mmTransactionIdentification,
						com.tools20022.repository.msg.CardIndividualTransaction1.mmProduct, com.tools20022.repository.msg.CardIndividualTransaction1.mmValidationDate,
						com.tools20022.repository.msg.CardIndividualTransaction1.mmValidationSequenceNumber);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardIndividualTransaction1";
				definition = "Individual card transaction entry details.";
				nextVersions_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CardPaymentServiceType2Code> getAdditionalService() {
		return additionalService == null ? Optional.empty() : Optional.of(additionalService);
	}

	public CardIndividualTransaction1 setAdditionalService(CardPaymentServiceType2Code additionalService) {
		this.additionalService = additionalService;
		return this;
	}

	public Optional<ExternalCardTransactionCategory1Code> getTransactionCategory() {
		return transactionCategory == null ? Optional.empty() : Optional.of(transactionCategory);
	}

	public CardIndividualTransaction1 setTransactionCategory(ExternalCardTransactionCategory1Code transactionCategory) {
		this.transactionCategory = transactionCategory;
		return this;
	}

	public Optional<Max35Text> getSaleReconciliationIdentification() {
		return saleReconciliationIdentification == null ? Optional.empty() : Optional.of(saleReconciliationIdentification);
	}

	public CardIndividualTransaction1 setSaleReconciliationIdentification(Max35Text saleReconciliationIdentification) {
		this.saleReconciliationIdentification = saleReconciliationIdentification;
		return this;
	}

	public Optional<Max35Text> getSaleReferenceNumber() {
		return saleReferenceNumber == null ? Optional.empty() : Optional.of(saleReferenceNumber);
	}

	public CardIndividualTransaction1 setSaleReferenceNumber(Max35Text saleReferenceNumber) {
		this.saleReferenceNumber = saleReferenceNumber;
		return this;
	}

	public Optional<Max35Text> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public CardIndividualTransaction1 setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public Optional<TransactionIdentifier1> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public CardIndividualTransaction1 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Optional<Product2> getProduct() {
		return product == null ? Optional.empty() : Optional.of(product);
	}

	public CardIndividualTransaction1 setProduct(Product2 product) {
		this.product = product;
		return this;
	}

	public Optional<ISODate> getValidationDate() {
		return validationDate == null ? Optional.empty() : Optional.of(validationDate);
	}

	public CardIndividualTransaction1 setValidationDate(ISODate validationDate) {
		this.validationDate = validationDate;
		return this;
	}

	public Optional<Max35Text> getValidationSequenceNumber() {
		return validationSequenceNumber == null ? Optional.empty() : Optional.of(validationSequenceNumber);
	}

	public CardIndividualTransaction1 setValidationSequenceNumber(Max35Text validationSequenceNumber) {
		this.validationSequenceNumber = validationSequenceNumber;
		return this;
	}
}