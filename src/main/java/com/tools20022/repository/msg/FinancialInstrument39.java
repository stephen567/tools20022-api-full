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
import com.tools20022.repository.choice.Quantity12Choice;
import com.tools20022.repository.choice.SecurityIdentification3Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TransferType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Account16;
import com.tools20022.repository.msg.PartyIdentificationAndAccount93;
import com.tools20022.repository.msg.SubAccount1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, eg, dividend option or valuation currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmIdentification
 * FinancialInstrument39.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmName
 * FinancialInstrument39.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmTransferType
 * FinancialInstrument39.mmTransferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmQuantity
 * FinancialInstrument39.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmAverageAcquisitionPrice
 * FinancialInstrument39.mmAverageAcquisitionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmTransferCurrency
 * FinancialInstrument39.mmTransferCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmTotalBookValue
 * FinancialInstrument39.mmTotalBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmTransfereeAccount
 * FinancialInstrument39.mmTransfereeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmSubAccountDetails
 * FinancialInstrument39.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmReceivingAgentDetails
 * FinancialInstrument39.mmReceivingAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmDeliveringAgentDetails
 * FinancialInstrument39.mmDeliveringAgentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrument39"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument39
 * ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument39
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument46
 * FinancialInstrument46}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34
 * FinancialInstrument34}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrument39", propOrder = {"identification", "name", "transferType", "quantity", "averageAcquisitionPrice", "transferCurrency", "totalBookValue", "transfereeAccount", "subAccountDetails", "receivingAgentDetails",
		"deliveringAgentDetails"})
public class FinancialInstrument39 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected SecurityIdentification3Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmIdentification
	 * FinancialInstrument46.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmIdentification
	 * FinancialInstrument34.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument39, SecurityIdentification3Choice> mmIdentification = new MMMessageAttribute<FinancialInstrument39, SecurityIdentification3Choice>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmIdentification);
			previousVersion_lazy = () -> FinancialInstrument34.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification3Choice.mmObject();
		}

		@Override
		public SecurityIdentification3Choice getValue(FinancialInstrument39 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, SecurityIdentification3Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Nm")
	protected Max350Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmName
	 * FinancialInstrument46.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmName
	 * FinancialInstrument34.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument39, Optional<Max350Text>> mmName = new MMMessageAttribute<FinancialInstrument39, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmName);
			previousVersion_lazy = () -> FinancialInstrument34.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(FinancialInstrument39 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, Optional<Max350Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfTp", required = true)
	protected TransferType1Code transferType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferType1Code
	 * TransferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferType
	 * SecuritiesTransfer.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the financial instrument is transferred as an asset or as cash."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmTransferType
	 * FinancialInstrument46.mmTransferType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmTransferType
	 * FinancialInstrument34.mmTransferType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument39, TransferType1Code> mmTransferType = new MMMessageAttribute<FinancialInstrument39, TransferType1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "TrfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferType";
			definition = "Specifies whether the financial instrument is transferred as an asset or as cash.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmTransferType);
			previousVersion_lazy = () -> FinancialInstrument34.mmTransferType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferType1Code.mmObject();
		}

		@Override
		public TransferType1Code getValue(FinancialInstrument39 obj) {
			return obj.getTransferType();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, TransferType1Code value) {
			obj.setTransferType(value);
		}
	};
	@XmlElement(name = "Qty")
	protected Quantity12Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity12Choice
	 * Quantity12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the quantity of assets to be transferred in units or in a percentage rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmQuantity
	 * FinancialInstrument46.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmQuantity
	 * FinancialInstrument34.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument39, Optional<Quantity12Choice>> mmQuantity = new MMMessageAttribute<FinancialInstrument39, Optional<Quantity12Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of assets to be transferred in units or in a percentage rate.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmQuantity);
			previousVersion_lazy = () -> FinancialInstrument34.mmQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity12Choice.mmObject();
		}

		@Override
		public Optional<Quantity12Choice> getValue(FinancialInstrument39 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, Optional<Quantity12Choice> value) {
			obj.setQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "AvrgAcqstnPric")
	protected ActiveOrHistoricCurrencyAndAmount averageAcquisitionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgAcqstnPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageAcquisitionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average cost per share of a security, including all charges and commissions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmAverageAcquisitionPrice
	 * FinancialInstrument46.mmAverageAcquisitionPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmAverageAcquisitionPrice
	 * FinancialInstrument34.mmAverageAcquisitionPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument39, Optional<ActiveOrHistoricCurrencyAndAmount>> mmAverageAcquisitionPrice = new MMMessageAttribute<FinancialInstrument39, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "AvrgAcqstnPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageAcquisitionPrice";
			definition = "Average cost per share of a security, including all charges and commissions.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmAverageAcquisitionPrice);
			previousVersion_lazy = () -> FinancialInstrument34.mmAverageAcquisitionPrice;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(FinancialInstrument39 obj) {
			return obj.getAverageAcquisitionPrice();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setAverageAcquisitionPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfCcy")
	protected CurrencyCode transferCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmTransferCurrency
	 * SecuritiesDeliveryObligation.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the currency to be used to transfer the holdings. Some transfer agents register holdings grouped by currency in addition to using the ISIN for multi-currency fund shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmTransferCurrency
	 * FinancialInstrument46.mmTransferCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument39, Optional<CurrencyCode>> mmTransferCurrency = new MMMessageAttribute<FinancialInstrument39, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmTransferCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "TrfCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCurrency";
			definition = "Identifies the currency to be used to transfer the holdings. Some transfer agents register holdings grouped by currency in addition to using the ISIN for multi-currency fund shares.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmTransferCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(FinancialInstrument39 obj) {
			return obj.getTransferCurrency();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, Optional<CurrencyCode> value) {
			obj.setTransferCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlBookVal")
	protected ActiveOrHistoricCurrencyAndAmount totalBookValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlBookVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmTotalBookValue
	 * FinancialInstrument46.mmTotalBookValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmTotalBookValue
	 * FinancialInstrument34.mmTotalBookValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument39, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTotalBookValue = new MMMessageAttribute<FinancialInstrument39, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "TtlBookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValue";
			definition = "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmTotalBookValue);
			previousVersion_lazy = () -> FinancialInstrument34.mmTotalBookValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(FinancialInstrument39 obj) {
			return obj.getTotalBookValue();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalBookValue(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfeeAcct")
	protected Account16 transfereeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account16
	 * Account16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
	 * InvestmentFundClass.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfeeAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransfereeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held in the name of a party that is not the name of the beneficial owner of the shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmTransfereeAccount
	 * FinancialInstrument46.mmTransfereeAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmTransfereeAccount
	 * FinancialInstrument34.mmTransfereeAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument39, Optional<Account16>> mmTransfereeAccount = new MMMessageAttribute<FinancialInstrument39, Optional<Account16>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "TrfeeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransfereeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmTransfereeAccount);
			previousVersion_lazy = () -> FinancialInstrument34.mmTransfereeAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Account16.mmObject();
		}

		@Override
		public Optional<Account16> getValue(FinancialInstrument39 obj) {
			return obj.getTransfereeAccount();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, Optional<Account16> value) {
			obj.setTransfereeAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected SubAccount1 subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubAccount1
	 * SubAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
	 * InvestmentFundClass.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-accounts that are grouped in a master or omnibus account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmSubAccountDetails
	 * FinancialInstrument46.mmSubAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmSubAccountDetails
	 * FinancialInstrument34.mmSubAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrument39, Optional<SubAccount1>> mmSubAccountDetails = new MMMessageAssociationEnd<FinancialInstrument39, Optional<SubAccount1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-accounts that are grouped in a master or omnibus account.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmSubAccountDetails);
			previousVersion_lazy = () -> FinancialInstrument34.mmSubAccountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubAccount1.mmObject();
		}

		@Override
		public Optional<SubAccount1> getValue(FinancialInstrument39 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, Optional<SubAccount1> value) {
			obj.setSubAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgAgtDtls")
	protected PartyIdentificationAndAccount93 receivingAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount93
	 * PartyIdentificationAndAccount93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmReceivingAgentDetails
	 * FinancialInstrument34.mmReceivingAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument39, Optional<PartyIdentificationAndAccount93>> mmReceivingAgentDetails = new MMMessageAttribute<FinancialInstrument39, Optional<PartyIdentificationAndAccount93>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository.";
			previousVersion_lazy = () -> FinancialInstrument34.mmReceivingAgentDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentificationAndAccount93.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount93> getValue(FinancialInstrument39 obj) {
			return obj.getReceivingAgentDetails();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, Optional<PartyIdentificationAndAccount93> value) {
			obj.setReceivingAgentDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgAgtDtls")
	protected PartyIdentificationAndAccount93 deliveringAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount93
	 * PartyIdentificationAndAccount93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmDeliveringAgentDetails
	 * FinancialInstrument46.mmDeliveringAgentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmDeliveringAgentDetails
	 * FinancialInstrument34.mmDeliveringAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument39, Optional<PartyIdentificationAndAccount93>> mmDeliveringAgentDetails = new MMMessageAttribute<FinancialInstrument39, Optional<PartyIdentificationAndAccount93>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmDeliveringAgentDetails);
			previousVersion_lazy = () -> FinancialInstrument34.mmDeliveringAgentDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentificationAndAccount93.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount93> getValue(FinancialInstrument39 obj) {
			return obj.getDeliveringAgentDetails();
		}

		@Override
		public void setValue(FinancialInstrument39 obj, Optional<PartyIdentificationAndAccount93> value) {
			obj.setDeliveringAgentDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument39.mmIdentification, com.tools20022.repository.msg.FinancialInstrument39.mmName,
						com.tools20022.repository.msg.FinancialInstrument39.mmTransferType, com.tools20022.repository.msg.FinancialInstrument39.mmQuantity, com.tools20022.repository.msg.FinancialInstrument39.mmAverageAcquisitionPrice,
						com.tools20022.repository.msg.FinancialInstrument39.mmTransferCurrency, com.tools20022.repository.msg.FinancialInstrument39.mmTotalBookValue, com.tools20022.repository.msg.FinancialInstrument39.mmTransfereeAccount,
						com.tools20022.repository.msg.FinancialInstrument39.mmSubAccountDetails, com.tools20022.repository.msg.FinancialInstrument39.mmReceivingAgentDetails,
						com.tools20022.repository.msg.FinancialInstrument39.mmDeliveringAgentDetails);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument39);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FinancialInstrument39";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstrument46.mmObject());
				previousVersion_lazy = () -> FinancialInstrument34.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification3Choice getIdentification() {
		return identification;
	}

	public FinancialInstrument39 setIdentification(SecurityIdentification3Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public FinancialInstrument39 setName(Max350Text name) {
		this.name = name;
		return this;
	}

	public TransferType1Code getTransferType() {
		return transferType;
	}

	public FinancialInstrument39 setTransferType(TransferType1Code transferType) {
		this.transferType = Objects.requireNonNull(transferType);
		return this;
	}

	public Optional<Quantity12Choice> getQuantity() {
		return quantity == null ? Optional.empty() : Optional.of(quantity);
	}

	public FinancialInstrument39 setQuantity(Quantity12Choice quantity) {
		this.quantity = quantity;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getAverageAcquisitionPrice() {
		return averageAcquisitionPrice == null ? Optional.empty() : Optional.of(averageAcquisitionPrice);
	}

	public FinancialInstrument39 setAverageAcquisitionPrice(ActiveOrHistoricCurrencyAndAmount averageAcquisitionPrice) {
		this.averageAcquisitionPrice = averageAcquisitionPrice;
		return this;
	}

	public Optional<CurrencyCode> getTransferCurrency() {
		return transferCurrency == null ? Optional.empty() : Optional.of(transferCurrency);
	}

	public FinancialInstrument39 setTransferCurrency(CurrencyCode transferCurrency) {
		this.transferCurrency = transferCurrency;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalBookValue() {
		return totalBookValue == null ? Optional.empty() : Optional.of(totalBookValue);
	}

	public FinancialInstrument39 setTotalBookValue(ActiveOrHistoricCurrencyAndAmount totalBookValue) {
		this.totalBookValue = totalBookValue;
		return this;
	}

	public Optional<Account16> getTransfereeAccount() {
		return transfereeAccount == null ? Optional.empty() : Optional.of(transfereeAccount);
	}

	public FinancialInstrument39 setTransfereeAccount(Account16 transfereeAccount) {
		this.transfereeAccount = transfereeAccount;
		return this;
	}

	public Optional<SubAccount1> getSubAccountDetails() {
		return subAccountDetails == null ? Optional.empty() : Optional.of(subAccountDetails);
	}

	public FinancialInstrument39 setSubAccountDetails(SubAccount1 subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount93> getReceivingAgentDetails() {
		return receivingAgentDetails == null ? Optional.empty() : Optional.of(receivingAgentDetails);
	}

	public FinancialInstrument39 setReceivingAgentDetails(PartyIdentificationAndAccount93 receivingAgentDetails) {
		this.receivingAgentDetails = receivingAgentDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount93> getDeliveringAgentDetails() {
		return deliveringAgentDetails == null ? Optional.empty() : Optional.of(deliveringAgentDetails);
	}

	public FinancialInstrument39 setDeliveringAgentDetails(PartyIdentificationAndAccount93 deliveringAgentDetails) {
		this.deliveringAgentDetails = deliveringAgentDetails;
		return this;
	}
}