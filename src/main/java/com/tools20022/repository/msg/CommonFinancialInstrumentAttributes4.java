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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tangible items of value to a business.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmSecurityStatus
 * CommonFinancialInstrumentAttributes4.mmSecurityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmISOSecurityLongName
 * CommonFinancialInstrumentAttributes4.mmISOSecurityLongName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmISOSecurityShortName
 * CommonFinancialInstrumentAttributes4.mmISOSecurityShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmNameValidFrom
 * CommonFinancialInstrumentAttributes4.mmNameValidFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmDenominationCurrency
 * CommonFinancialInstrumentAttributes4.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmCertificateNumber
 * CommonFinancialInstrumentAttributes4.mmCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmContractVersionNumber
 * CommonFinancialInstrumentAttributes4.mmContractVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmCouponAttachedNumber
 * CommonFinancialInstrumentAttributes4.mmCouponAttachedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmTaxLotNumber
 * CommonFinancialInstrumentAttributes4.mmTaxLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPoolNumber
 * CommonFinancialInstrumentAttributes4.mmPoolNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmCoveredIndicator
 * CommonFinancialInstrumentAttributes4.mmCoveredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmLegalRestrictions
 * CommonFinancialInstrumentAttributes4.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPositionLimit
 * CommonFinancialInstrumentAttributes4.mmPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmNearTermPositionLimit
 * CommonFinancialInstrumentAttributes4.mmNearTermPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmListingDate
 * CommonFinancialInstrumentAttributes4.mmListingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmRecordDate
 * CommonFinancialInstrumentAttributes4.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmExpiryDate
 * CommonFinancialInstrumentAttributes4.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPurpose
 * CommonFinancialInstrumentAttributes4.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmClassificationType
 * CommonFinancialInstrumentAttributes4.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmIssuance
 * CommonFinancialInstrumentAttributes4.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmTradingMarket
 * CommonFinancialInstrumentAttributes4.mmTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmSpreadAndBenchmarkCurve
 * CommonFinancialInstrumentAttributes4.mmSpreadAndBenchmarkCurve}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPutType
 * CommonFinancialInstrumentAttributes4.mmPutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmCallType
 * CommonFinancialInstrumentAttributes4.mmCallType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmFungibleIndicator
 * CommonFinancialInstrumentAttributes4.mmFungibleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmConfidential
 * CommonFinancialInstrumentAttributes4.mmConfidential}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPrivatePlacement
 * CommonFinancialInstrumentAttributes4.mmPrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmConvertibleIndicator
 * CommonFinancialInstrumentAttributes4.mmConvertibleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmConversionPeriod
 * CommonFinancialInstrumentAttributes4.mmConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmConversionRatioNumerator
 * CommonFinancialInstrumentAttributes4.mmConversionRatioNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmConversionRatioDenominator
 * CommonFinancialInstrumentAttributes4.mmConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPrimaryPlaceOfDeposit
 * CommonFinancialInstrumentAttributes4.mmPrimaryPlaceOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmTradingMethod
 * CommonFinancialInstrumentAttributes4.mmTradingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmTEFRARule
 * CommonFinancialInstrumentAttributes4.mmTEFRARule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmSerieNumber
 * CommonFinancialInstrumentAttributes4.mmSerieNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmClass_
 * CommonFinancialInstrumentAttributes4.mmClass_}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmWithholdingTaxRegime
 * CommonFinancialInstrumentAttributes4.mmWithholdingTaxRegime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPaymentStatus
 * CommonFinancialInstrumentAttributes4.mmPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmInitialPhysicalForm
 * CommonFinancialInstrumentAttributes4.mmInitialPhysicalForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmAfterExchangePhysicalForm
 * CommonFinancialInstrumentAttributes4.mmAfterExchangePhysicalForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmCommonSafekeeper
 * CommonFinancialInstrumentAttributes4.mmCommonSafekeeper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmRedemptionType
 * CommonFinancialInstrumentAttributes4.mmRedemptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmRedemptionPaymentCurrency
 * CommonFinancialInstrumentAttributes4.mmRedemptionPaymentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmRestriction
 * CommonFinancialInstrumentAttributes4.mmRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmSettlementInformation
 * CommonFinancialInstrumentAttributes4.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmFinancialInstrumentForm
 * CommonFinancialInstrumentAttributes4.mmFinancialInstrumentForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmContactName
 * CommonFinancialInstrumentAttributes4.mmContactName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmLeadManager
 * CommonFinancialInstrumentAttributes4.mmLeadManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPrincipalPayingAgent
 * CommonFinancialInstrumentAttributes4.mmPrincipalPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPayingAgent
 * CommonFinancialInstrumentAttributes4.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmDepository
 * CommonFinancialInstrumentAttributes4.mmDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmUnderlyingRisk
 * CommonFinancialInstrumentAttributes4.mmUnderlyingRisk}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommonFinancialInstrumentAttributes4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tangible items of value to a business."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1
 * CommonFinancialInstrumentAttributes1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CommonFinancialInstrumentAttributes4", propOrder = {"securityStatus", "iSOSecurityLongName", "iSOSecurityShortName", "nameValidFrom", "denominationCurrency", "certificateNumber", "contractVersionNumber",
		"couponAttachedNumber", "taxLotNumber", "poolNumber", "coveredIndicator", "legalRestrictions", "positionLimit", "nearTermPositionLimit", "listingDate", "recordDate", "expiryDate", "purpose", "classificationType", "issuance",
		"tradingMarket", "spreadAndBenchmarkCurve", "putType", "callType", "fungibleIndicator", "confidential", "privatePlacement", "convertibleIndicator", "conversionPeriod", "conversionRatioNumerator", "conversionRatioDenominator",
		"primaryPlaceOfDeposit", "tradingMethod", "tEFRARule", "serieNumber", "class_", "withholdingTaxRegime", "paymentStatus", "initialPhysicalForm", "afterExchangePhysicalForm", "commonSafekeeper", "redemptionType",
		"redemptionPaymentCurrency", "restriction", "settlementInformation", "financialInstrumentForm", "contactName", "leadManager", "principalPayingAgent", "payingAgent", "depository", "underlyingRisk"})
public class CommonFinancialInstrumentAttributes4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctySts")
	protected SecurityStatus3Choice securityStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityStatus3Choice
	 * SecurityStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecurityStatus
	 * Security.mmSecurityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctySts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 965</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<SecurityStatus3Choice>> mmSecurityStatus = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<SecurityStatus3Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecurityStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "SctySts";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "965"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityStatus3Choice.mmObject();
		}

		@Override
		public Optional<SecurityStatus3Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getSecurityStatus();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<SecurityStatus3Choice> value) {
			obj.setSecurityStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "ISOSctyLngNm")
	protected Max350Text iSOSecurityLongName;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISOSctyLngNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISOSecurityLongName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max350Text>> mmISOSecurityLongName = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "ISOSctyLngNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISOSecurityLongName";
			definition = "Name of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getISOSecurityLongName();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Max350Text> value) {
			obj.setISOSecurityLongName(value.orElse(null));
		}
	};
	@XmlElement(name = "ISOSctyShrtNm")
	protected Max35Text iSOSecurityShortName;
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
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmShortName
	 * LocalName.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISOSctyShrtNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISOSecurityShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short name of the security expressed as ISO 18773/18774."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max35Text>> mmISOSecurityShortName = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmShortName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "ISOSctyShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISOSecurityShortName";
			definition = "Short name of the security expressed as ISO 18773/18774.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getISOSecurityShortName();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Max35Text> value) {
			obj.setISOSecurityShortName(value.orElse(null));
		}
	};
	@XmlElement(name = "NmVldFr")
	protected DateAndDateTimeChoice nameValidFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmVldFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameValidFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date since when the name of the security is valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<DateAndDateTimeChoice>> mmNameValidFrom = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "NmVldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameValidFrom";
			definition = "Defines the date since when the name of the security is valid.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getNameValidFrom();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setNameValidFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "DnmtnCcy", required = true)
	protected CurrencyCode denominationCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
	 * Security.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 15</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, CurrencyCode> mmDenominationCurrency = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, CurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "15"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getDenominationCurrency();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, CurrencyCode value) {
			obj.setDenominationCurrency(value);
		}
	};
	@XmlElement(name = "CertNb")
	protected Max35Text certificateNumber;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
	 * SecuritiesCertificate.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a certificate assigned by the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max35Text>> mmCertificateNumber = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesCertificate.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "CertNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			definition = "Unique and unambiguous identifier of a certificate assigned by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getCertificateNumber();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Max35Text> value) {
			obj.setCertificateNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctVrsnNb")
	protected Number contractVersionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctVrsnNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractVersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version number assigned to the contract associated with the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Number>> mmContractVersionNumber = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "CtrctVrsnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractVersionNumber";
			definition = "Version number assigned to the contract associated with the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getContractVersionNumber();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Number> value) {
			obj.setContractVersionNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CpnAttchdNb")
	protected Max3NumericText couponAttachedNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
	 * CouponAttached.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnAttchdNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponAttachedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached to the physical security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max3NumericText>> mmCouponAttachedNumber = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max3NumericText>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "CpnAttchdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponAttachedNumber";
			definition = "Number of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Optional<Max3NumericText> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getCouponAttachedNumber();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Max3NumericText> value) {
			obj.setCouponAttachedNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxLotNb")
	protected Max15NumericText taxLotNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
	 * LotBreakdown.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxLotNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max15NumericText>> mmTaxLotNumber = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max15NumericText>>() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "TaxLotNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxLotNumber";
			definition = "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getTaxLotNumber();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Max15NumericText> value) {
			obj.setTaxLotNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "PoolNb")
	protected Max15NumericText poolNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPoolNumber
	 * Debt.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a group of underlying assets assigned by the issuer of a factored security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 691</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max15NumericText>> mmPoolNumber = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max15NumericText>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "PoolNb";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "691"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getPoolNumber();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Max15NumericText> value) {
			obj.setPoolNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CvrdInd")
	protected YesNoIndicator coveredIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement#mmCoveredIndicator
	 * Entitlement.mmCoveredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CvrdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative product is covered or not by an underlying financial instrument position."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<YesNoIndicator>> mmCoveredIndicator = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Entitlement.mmCoveredIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "CvrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredIndicator";
			definition = "Indicates whether the derivative product is covered or not by an underlying financial instrument position.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getCoveredIndicator();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<YesNoIndicator> value) {
			obj.setCoveredIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "LglRstrctns")
	protected LegalRestrictions4Choice legalRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LegalRestrictions4Choice
	 * LegalRestrictions4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestriction
	 * Security.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRstrctns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the regulatory restrictions applicable to a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<LegalRestrictions4Choice>> mmLegalRestrictions = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<LegalRestrictions4Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Specifies the regulatory restrictions applicable to a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LegalRestrictions4Choice.mmObject();
		}

		@Override
		public Optional<LegalRestrictions4Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getLegalRestrictions();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<LegalRestrictions4Choice> value) {
			obj.setLegalRestrictions(value.orElse(null));
		}
	};
	@XmlElement(name = "PosLmt")
	protected FinancialInstrumentQuantity1Choice positionLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosLmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position limits are created for the purpose of maintaining stable and fair markets. Contracts held by one individual investor with different brokers may be combined in order to gauge accurately the level of control held by one party. \n\nEach option and futures contract will have varying position limits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 970</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<FinancialInstrumentQuantity1Choice>> mmPositionLimit = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "PosLmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "970"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionLimit";
			definition = "Position limits are created for the purpose of maintaining stable and fair markets. Contracts held by one individual investor with different brokers may be combined in order to gauge accurately the level of control held by one party. \n\nEach option and futures contract will have varying position limits.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getPositionLimit();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setPositionLimit(value.orElse(null));
		}
	};
	@XmlElement(name = "NearTermPosLmt")
	protected FinancialInstrumentQuantity1Choice nearTermPositionLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmNearTermPositionLimit
	 * Security.mmNearTermPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NearTermPosLmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NearTermPositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Near-term position limit for the instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 971</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<FinancialInstrumentQuantity1Choice>> mmNearTermPositionLimit = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmNearTermPositionLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "NearTermPosLmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "971"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Near-term position limit for the instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getNearTermPositionLimit();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setNearTermPositionLimit(value.orElse(null));
		}
	};
	@XmlElement(name = "ListgDt")
	protected ISODate listingDate;
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListingDate
	 * TradingMarket.mmListingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original Date/time at which the security is listed at the specific exchange or trading venue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<ISODate>> mmListingDate = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmListingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "ListgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListingDate";
			definition = "Original Date/time at which the security is listed at the specific exchange or trading venue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getListingDate();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<ISODate> value) {
			obj.setListingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RcrdDt")
	protected ISODateTime recordDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
	 * CorporateActionDeadline.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which positions are struck to note which parties are entitled to receive the entitlement to a corporate event or vote at a meeting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<ISODateTime>> mmRecordDate = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRecordDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date/time at which positions are struck to note which parties are entitled to receive the entitlement to a corporate event or vote at a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getRecordDate();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<ISODateTime> value) {
			obj.setRecordDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt")
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a privilege expires."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<ISODate>> mmExpiryDate = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which a privilege expires.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<ISODate> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Purp")
	protected Max256Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmPurpose
	 * Issuance.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for which money is raised through the issuance of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max256Text>> mmPurpose = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Max256Text> value) {
			obj.setPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "ClssfctnTp")
	protected ClassificationType2 classificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ClassificationType2
	 * ClassificationType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
	 * Asset.mmAssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information allowing the classification of a financial instrument, for example, with its ISO CFI (Classification of Financial Instrument) or product type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<ClassificationType2>> mmClassificationType = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<ClassificationType2>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Information allowing the classification of a financial instrument, for example, with its ISO CFI (Classification of Financial Instrument) or product type.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ClassificationType2.mmObject();
		}

		@Override
		public Optional<ClassificationType2> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getClassificationType();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<ClassificationType2> value) {
			obj.setClassificationType(value.orElse(null));
		}
	};
	@XmlElement(name = "Issnc")
	protected Issuance3 issuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Issuance3 Issuance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmIssuance
	 * Asset.mmIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issnc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details regarding the issuance of an asset."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Issuance3>> mmIssuance = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Issuance3>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmIssuance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "Issnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Details regarding the issuance of an asset.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Issuance3.mmObject();
		}

		@Override
		public Optional<Issuance3> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getIssuance();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Issuance3> value) {
			obj.setIssuance(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgMkt")
	protected List<TradingParameters1> tradingMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgMkt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is traded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, List<TradingParameters1>> mmTradingMarket = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, List<TradingParameters1>>() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "TradgMkt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMarket";
			definition = "Market(s) on which the security is traded.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradingParameters1.mmObject();
		}

		@Override
		public List<TradingParameters1> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getTradingMarket();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, List<TradingParameters1> value) {
			obj.setTradingMarket(value);
		}
	};
	@XmlElement(name = "SprdAndBchmkCrv")
	protected List<BenchmarkCurve4> spreadAndBenchmarkCurve;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BenchmarkCurve4
	 * BenchmarkCurve4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SprdAndBchmkCrv"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadAndBenchmarkCurve"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the spread to benchmark details of an indication of interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, List<BenchmarkCurve4>> mmSpreadAndBenchmarkCurve = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, List<BenchmarkCurve4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "SprdAndBchmkCrv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadAndBenchmarkCurve";
			definition = "Indicates the spread to benchmark details of an indication of interest.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BenchmarkCurve4.mmObject();
		}

		@Override
		public List<BenchmarkCurve4> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getSpreadAndBenchmarkCurve();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, List<BenchmarkCurve4> value) {
			obj.setSpreadAndBenchmarkCurve(value);
		}
	};
	@XmlElement(name = "PutTp")
	protected PutType3Choice putType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PutType3Choice
	 * PutType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Represents the type of put."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<PutType3Choice>> mmPutType = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<PutType3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "PutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutType";
			definition = "Represents the type of put.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PutType3Choice.mmObject();
		}

		@Override
		public Optional<PutType3Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getPutType();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<PutType3Choice> value) {
			obj.setPutType(value.orElse(null));
		}
	};
	@XmlElement(name = "CallTp")
	protected CallType3Choice callType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CallType3Choice
	 * CallType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CallTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Represents the type of call."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<CallType3Choice>> mmCallType = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<CallType3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "CallTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallType";
			definition = "Represents the type of call.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CallType3Choice.mmObject();
		}

		@Override
		public Optional<CallType3Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getCallType();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<CallType3Choice> value) {
			obj.setCallType(value.orElse(null));
		}
	};
	@XmlElement(name = "FngbInd")
	protected YesNoIndicator fungibleIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FngbInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FungibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<YesNoIndicator>> mmFungibleIndicator = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "FngbInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FungibleIndicator";
			definition = "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getFungibleIndicator();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<YesNoIndicator> value) {
			obj.setFungibleIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Cnfdtl")
	protected YesNoIndicator confidential;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cnfdtl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confidential"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the details of the security are to be made available to the market, or kept private between ICSDs and agency network."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<YesNoIndicator>> mmConfidential = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "Cnfdtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confidential";
			definition = "Indicates whether the details of the security are to be made available to the market, or kept private between ICSDs and agency network.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getConfidential();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<YesNoIndicator> value) {
			obj.setConfidential(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvtPlcmnt")
	protected YesNoIndicator privatePlacement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvtPlcmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivatePlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The sale of securities directly to private persons, institutional investors, or both outside a public offering. Such non-public deals (often without a publicly available prospectus) closing through the ICSDs are placed directly with investors."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<YesNoIndicator>> mmPrivatePlacement = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "PrvtPlcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivatePlacement";
			definition = "The sale of securities directly to private persons, institutional investors, or both outside a public offering. Such non-public deals (often without a publicly available prospectus) closing through the ICSDs are placed directly with investors.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getPrivatePlacement();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<YesNoIndicator> value) {
			obj.setPrivatePlacement(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvtblInd")
	protected YesNoIndicator convertibleIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvtblInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor or the issuer has a conversion option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<YesNoIndicator>> mmConvertibleIndicator = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "ConvtblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the investor or the issuer has a conversion option.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getConvertibleIndicator();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<YesNoIndicator> value) {
			obj.setConvertibleIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsPrd")
	protected DateTimePeriodDetails conversionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a convertible security may be converted according to the terms of the issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<DateTimePeriodDetails>> mmConversionPeriod = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<DateTimePeriodDetails>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "ConvsPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionPeriod";
			definition = "Period during which a convertible security may be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodDetails.mmObject();
		}

		@Override
		public Optional<DateTimePeriodDetails> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getConversionPeriod();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<DateTimePeriodDetails> value) {
			obj.setConversionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsRatioNmrtr")
	protected FinancialInstrumentQuantity1Choice conversionRatioNumerator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsRatioNmrtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of target securities for the conversion."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<FinancialInstrumentQuantity1Choice>> mmConversionRatioNumerator = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "ConvsRatioNmrtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionRatioNumerator";
			definition = "Number of target securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getConversionRatioNumerator();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setConversionRatioNumerator(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsRatioDnmtr")
	protected FinancialInstrumentQuantity1Choice conversionRatioDenominator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsRatioDnmtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of held securities for the conversion."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<FinancialInstrumentQuantity1Choice>> mmConversionRatioDenominator = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "ConvsRatioDnmtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionRatioDenominator";
			definition = "Number of held securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getConversionRatioDenominator();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setConversionRatioDenominator(value.orElse(null));
		}
	};
	@XmlElement(name = "PmryPlcOfDpst")
	protected PartyIdentification71Choice primaryPlaceOfDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryPlcOfDpst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryPlaceOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Primary place of deposit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<PartyIdentification71Choice>> mmPrimaryPlaceOfDeposit = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<PartyIdentification71Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "PmryPlcOfDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryPlaceOfDeposit";
			definition = "Primary place of deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getPrimaryPlaceOfDeposit();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<PartyIdentification71Choice> value) {
			obj.setPrimaryPlaceOfDeposit(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgMtd")
	protected UnitOrFaceAmount1Choice tradingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the notional amount value is to be traded in either an amount or in units."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<UnitOrFaceAmount1Choice>> mmTradingMethod = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<UnitOrFaceAmount1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "TradgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMethod";
			definition = "Indicates whether the notional amount value is to be traded in either an amount or in units.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getTradingMethod();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setTradingMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "TEFRARule")
	protected TEFRARules3Choice tEFRARule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TEFRARules3Choice
	 * TEFRARules3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TEFRARule"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEFRARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the TEFRA rule under which the security is issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<TEFRARules3Choice>> mmTEFRARule = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<TEFRARules3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "TEFRARule";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TEFRARule";
			definition = "Indicates the TEFRA rule under which the security is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TEFRARules3Choice.mmObject();
		}

		@Override
		public Optional<TEFRARules3Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getTEFRARule();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<TEFRARules3Choice> value) {
			obj.setTEFRARule(value.orElse(null));
		}
	};
	@XmlElement(name = "SrNb")
	protected Max16Text serieNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerieNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the series number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max16Text>> mmSerieNumber = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max16Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "SrNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerieNumber";
			definition = "Identifies the series number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Optional<Max16Text> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getSerieNumber();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Max16Text> value) {
			obj.setSerieNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Clss")
	protected Max16Text class_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Clss"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Class"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier that links multiple security classes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max16Text>> mmClass_ = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<Max16Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "Clss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Class";
			definition = "Identifier that links multiple security classes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Optional<Max16Text> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getClass_();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Max16Text> value) {
			obj.setClass_(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgTaxRgm")
	protected List<SecurityWithHoldingTax1> withholdingTaxRegime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityWithHoldingTax1
	 * SecurityWithHoldingTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxRgm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRegime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount or percentage of a cash distribution that will be withheld by a tax authority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, List<SecurityWithHoldingTax1>> mmWithholdingTaxRegime = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, List<SecurityWithHoldingTax1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRgm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRegime";
			definition = "Amount or percentage of a cash distribution that will be withheld by a tax authority.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityWithHoldingTax1.mmObject();
		}

		@Override
		public List<SecurityWithHoldingTax1> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getWithholdingTaxRegime();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, List<SecurityWithHoldingTax1> value) {
			obj.setWithholdingTaxRegime(value);
		}
	};
	@XmlElement(name = "PmtSts")
	protected SecuritiesPaymentStatus7Choice paymentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice
	 * SecuritiesPaymentStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of payment of a security at a particular time."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<SecuritiesPaymentStatus7Choice>> mmPaymentStatus = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<SecuritiesPaymentStatus7Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "PmtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesPaymentStatus7Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesPaymentStatus7Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getPaymentStatus();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<SecuritiesPaymentStatus7Choice> value) {
			obj.setPaymentStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "InitlPhysForm")
	protected InitialPhysicalForm4Choice initialPhysicalForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InitialPhysicalForm4Choice
	 * InitialPhysicalForm4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlPhysForm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialPhysicalForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the physical form of the securities on the closing date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<InitialPhysicalForm4Choice>> mmInitialPhysicalForm = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<InitialPhysicalForm4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "InitlPhysForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialPhysicalForm";
			definition = "Indicates the physical form of the securities on the closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InitialPhysicalForm4Choice.mmObject();
		}

		@Override
		public Optional<InitialPhysicalForm4Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getInitialPhysicalForm();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<InitialPhysicalForm4Choice> value) {
			obj.setInitialPhysicalForm(value.orElse(null));
		}
	};
	@XmlElement(name = "AftrXchgPhysForm")
	protected InitialPhysicalForm3Choice afterExchangePhysicalForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InitialPhysicalForm3Choice
	 * InitialPhysicalForm3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AftrXchgPhysForm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterExchangePhysicalForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the physical form of the securities after the exchange of the initial certificate issued on the closing date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<InitialPhysicalForm3Choice>> mmAfterExchangePhysicalForm = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<InitialPhysicalForm3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "AftrXchgPhysForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterExchangePhysicalForm";
			definition = "Indicates the physical form of the securities after the exchange of the initial certificate issued on the closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InitialPhysicalForm3Choice.mmObject();
		}

		@Override
		public Optional<InitialPhysicalForm3Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getAfterExchangePhysicalForm();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<InitialPhysicalForm3Choice> value) {
			obj.setAfterExchangePhysicalForm(value.orElse(null));
		}
	};
	@XmlElement(name = "CmonSfkpr")
	protected AnyBICIdentifier commonSafekeeper;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonSfkpr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonSafekeeper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity appointed by the ICSDs to provide safekeeping for securities in new global note (NGN) form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<AnyBICIdentifier>> mmCommonSafekeeper = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<AnyBICIdentifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "CmonSfkpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonSafekeeper";
			definition = "Entity appointed by the ICSDs to provide safekeeping for securities in new global note (NGN) form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public Optional<AnyBICIdentifier> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getCommonSafekeeper();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<AnyBICIdentifier> value) {
			obj.setCommonSafekeeper(value.orElse(null));
		}
	};
	@XmlElement(name = "RedTp")
	protected MaturityRedemptionType3Choice redemptionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MaturityRedemptionType3Choice
	 * MaturityRedemptionType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of redemption at maturity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<MaturityRedemptionType3Choice>> mmRedemptionType = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<MaturityRedemptionType3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "RedTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionType";
			definition = "Indicates the type of redemption at maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MaturityRedemptionType3Choice.mmObject();
		}

		@Override
		public Optional<MaturityRedemptionType3Choice> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getRedemptionType();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<MaturityRedemptionType3Choice> value) {
			obj.setRedemptionType(value.orElse(null));
		}
	};
	@XmlElement(name = "RedPmtCcy")
	protected ActiveCurrencyCode redemptionPaymentCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPmtCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPaymentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISO currency for the payment of the cash proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<ActiveCurrencyCode>> mmRedemptionPaymentCurrency = new MMMessageAttribute<CommonFinancialInstrumentAttributes4, Optional<ActiveCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "RedPmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentCurrency";
			definition = "ISO currency for the payment of the cash proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getRedemptionPaymentCurrency();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<ActiveCurrencyCode> value) {
			obj.setRedemptionPaymentCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "Rstrctn")
	protected List<SecurityRestriction2> restriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityRestriction2
	 * SecurityRestriction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory restriction(s) linked to the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, List<SecurityRestriction2>> mmRestriction = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, List<SecurityRestriction2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Regulatory restriction(s) linked to the security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityRestriction2.mmObject();
		}

		@Override
		public List<SecurityRestriction2> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getRestriction();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, List<SecurityRestriction2> value) {
			obj.setRestriction(value);
		}
	};
	@XmlElement(name = "SttlmInf")
	protected List<SettlementInformation17> settlementInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation17
	 * SettlementInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, List<SettlementInformation17>> mmSettlementInformation = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, List<SettlementInformation17>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "SttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInformation";
			definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementInformation17.mmObject();
		}

		@Override
		public List<SettlementInformation17> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getSettlementInformation();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, List<SettlementInformation17> value) {
			obj.setSettlementInformation(value);
		}
	};
	@XmlElement(name = "FinInstrmForm")
	protected FinancialInstrumentForm2 financialInstrumentForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentForm2
	 * FinancialInstrumentForm2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmForm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the form of the financial Instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<FinancialInstrumentForm2>> mmFinancialInstrumentForm = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<FinancialInstrumentForm2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentForm";
			definition = "Indicates the form of the financial Instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentForm2.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentForm2> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getFinancialInstrumentForm();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<FinancialInstrumentForm2> value) {
			obj.setFinancialInstrumentForm(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctNm")
	protected Organisation27 contactName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details (name, e-mail address and/or telephone number) of the person requesting the allocation of the ISIN used as a point of reference in case further clarifications are required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>> mmContactName = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "CtctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactName";
			definition = "Details (name, e-mail address and/or telephone number) of the person requesting the allocation of the ISIN used as a point of reference in case further clarifications are required.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation27.mmObject();
		}

		@Override
		public Optional<Organisation27> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getContactName();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Organisation27> value) {
			obj.setContactName(value.orElse(null));
		}
	};
	@XmlElement(name = "LeadMgr")
	protected Organisation27 leadManager;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LeadMgr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LeadManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity appointed by the issuer to structure and lead the placement of a syndicated issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>> mmLeadManager = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "LeadMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LeadManager";
			definition = "Entity appointed by the issuer to structure and lead the placement of a syndicated issue.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation27.mmObject();
		}

		@Override
		public Optional<Organisation27> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getLeadManager();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Organisation27> value) {
			obj.setLeadManager(value.orElse(null));
		}
	};
	@XmlElement(name = "PrncplPngAgt")
	protected Organisation27 principalPayingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrncplPngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalPayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Main party appointed to distribute payment or securities on behalf of the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>> mmPrincipalPayingAgent = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "PrncplPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalPayingAgent";
			definition = "Main party appointed to distribute payment or securities on behalf of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation27.mmObject();
		}

		@Override
		public Optional<Organisation27> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getPrincipalPayingAgent();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Organisation27> value) {
			obj.setPrincipalPayingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "PngAgt")
	protected Organisation27 payingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional party appointed to distribute payment or securities on behalf of the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>> mmPayingAgent = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Additional party appointed to distribute payment or securities on behalf of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation27.mmObject();
		}

		@Override
		public Optional<Organisation27> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Organisation27> value) {
			obj.setPayingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "Dpstry")
	protected Organisation27 depository;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dpstry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Depository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity appointed by the relevant clearing system as a depository for instruments issued in global or definitive form. The depository keeps the securities for safekeeping purposes on behalf of the clearing system(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>> mmDepository = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "Entity appointed by the relevant clearing system as a depository for instruments issued in global or definitive form. The depository keeps the securities for safekeeping purposes on behalf of the clearing system(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation27.mmObject();
		}

		@Override
		public Optional<Organisation27> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getDepository();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Organisation27> value) {
			obj.setDepository(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygRsk")
	protected Organisation27 underlyingRisk;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4
	 * CommonFinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygRsk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity(ies), asset(s) or security(ies) on which the credit responsibility lies as identified in the documentation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>> mmUnderlyingRisk = new MMMessageAssociationEnd<CommonFinancialInstrumentAttributes4, Optional<Organisation27>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmObject();
			isDerived = false;
			xmlTag = "UndrlygRsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingRisk";
			definition = "Entity(ies), asset(s) or security(ies) on which the credit responsibility lies as identified in the documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation27.mmObject();
		}

		@Override
		public Optional<Organisation27> getValue(CommonFinancialInstrumentAttributes4 obj) {
			return obj.getUnderlyingRisk();
		}

		@Override
		public void setValue(CommonFinancialInstrumentAttributes4 obj, Optional<Organisation27> value) {
			obj.setUnderlyingRisk(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmSecurityStatus, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmISOSecurityLongName,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmISOSecurityShortName, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmNameValidFrom,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmDenominationCurrency, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmCertificateNumber,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmContractVersionNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmCouponAttachedNumber,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmTaxLotNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmPoolNumber,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmCoveredIndicator, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmLegalRestrictions,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmPositionLimit, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmNearTermPositionLimit,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmListingDate, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmRecordDate,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmExpiryDate, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmPurpose,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmClassificationType, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmIssuance,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmTradingMarket, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmSpreadAndBenchmarkCurve,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmPutType, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmCallType,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmFungibleIndicator, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmConfidential,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmPrivatePlacement, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmConvertibleIndicator,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmConversionPeriod, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmConversionRatioNumerator,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmConversionRatioDenominator, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmPrimaryPlaceOfDeposit,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmTradingMethod, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmTEFRARule,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmSerieNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmClass_,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmWithholdingTaxRegime, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmPaymentStatus,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmInitialPhysicalForm, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmAfterExchangePhysicalForm,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmCommonSafekeeper, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmRedemptionType,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmRedemptionPaymentCurrency, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmRestriction,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmSettlementInformation, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmFinancialInstrumentForm,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmContactName, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmLeadManager,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmPrincipalPayingAgent, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmPayingAgent,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmDepository, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4.mmUnderlyingRisk);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CommonFinancialInstrumentAttributes4";
				definition = "Tangible items of value to a business.";
				previousVersion_lazy = () -> CommonFinancialInstrumentAttributes1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecurityStatus3Choice> getSecurityStatus() {
		return securityStatus == null ? Optional.empty() : Optional.of(securityStatus);
	}

	public CommonFinancialInstrumentAttributes4 setSecurityStatus(SecurityStatus3Choice securityStatus) {
		this.securityStatus = securityStatus;
		return this;
	}

	public Optional<Max350Text> getISOSecurityLongName() {
		return iSOSecurityLongName == null ? Optional.empty() : Optional.of(iSOSecurityLongName);
	}

	public CommonFinancialInstrumentAttributes4 setISOSecurityLongName(Max350Text iSOSecurityLongName) {
		this.iSOSecurityLongName = iSOSecurityLongName;
		return this;
	}

	public Optional<Max35Text> getISOSecurityShortName() {
		return iSOSecurityShortName == null ? Optional.empty() : Optional.of(iSOSecurityShortName);
	}

	public CommonFinancialInstrumentAttributes4 setISOSecurityShortName(Max35Text iSOSecurityShortName) {
		this.iSOSecurityShortName = iSOSecurityShortName;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getNameValidFrom() {
		return nameValidFrom == null ? Optional.empty() : Optional.of(nameValidFrom);
	}

	public CommonFinancialInstrumentAttributes4 setNameValidFrom(DateAndDateTimeChoice nameValidFrom) {
		this.nameValidFrom = nameValidFrom;
		return this;
	}

	public CurrencyCode getDenominationCurrency() {
		return denominationCurrency;
	}

	public CommonFinancialInstrumentAttributes4 setDenominationCurrency(CurrencyCode denominationCurrency) {
		this.denominationCurrency = Objects.requireNonNull(denominationCurrency);
		return this;
	}

	public Optional<Max35Text> getCertificateNumber() {
		return certificateNumber == null ? Optional.empty() : Optional.of(certificateNumber);
	}

	public CommonFinancialInstrumentAttributes4 setCertificateNumber(Max35Text certificateNumber) {
		this.certificateNumber = certificateNumber;
		return this;
	}

	public Optional<Number> getContractVersionNumber() {
		return contractVersionNumber == null ? Optional.empty() : Optional.of(contractVersionNumber);
	}

	public CommonFinancialInstrumentAttributes4 setContractVersionNumber(Number contractVersionNumber) {
		this.contractVersionNumber = contractVersionNumber;
		return this;
	}

	public Optional<Max3NumericText> getCouponAttachedNumber() {
		return couponAttachedNumber == null ? Optional.empty() : Optional.of(couponAttachedNumber);
	}

	public CommonFinancialInstrumentAttributes4 setCouponAttachedNumber(Max3NumericText couponAttachedNumber) {
		this.couponAttachedNumber = couponAttachedNumber;
		return this;
	}

	public Optional<Max15NumericText> getTaxLotNumber() {
		return taxLotNumber == null ? Optional.empty() : Optional.of(taxLotNumber);
	}

	public CommonFinancialInstrumentAttributes4 setTaxLotNumber(Max15NumericText taxLotNumber) {
		this.taxLotNumber = taxLotNumber;
		return this;
	}

	public Optional<Max15NumericText> getPoolNumber() {
		return poolNumber == null ? Optional.empty() : Optional.of(poolNumber);
	}

	public CommonFinancialInstrumentAttributes4 setPoolNumber(Max15NumericText poolNumber) {
		this.poolNumber = poolNumber;
		return this;
	}

	public Optional<YesNoIndicator> getCoveredIndicator() {
		return coveredIndicator == null ? Optional.empty() : Optional.of(coveredIndicator);
	}

	public CommonFinancialInstrumentAttributes4 setCoveredIndicator(YesNoIndicator coveredIndicator) {
		this.coveredIndicator = coveredIndicator;
		return this;
	}

	public Optional<LegalRestrictions4Choice> getLegalRestrictions() {
		return legalRestrictions == null ? Optional.empty() : Optional.of(legalRestrictions);
	}

	public CommonFinancialInstrumentAttributes4 setLegalRestrictions(LegalRestrictions4Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getPositionLimit() {
		return positionLimit == null ? Optional.empty() : Optional.of(positionLimit);
	}

	public CommonFinancialInstrumentAttributes4 setPositionLimit(FinancialInstrumentQuantity1Choice positionLimit) {
		this.positionLimit = positionLimit;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getNearTermPositionLimit() {
		return nearTermPositionLimit == null ? Optional.empty() : Optional.of(nearTermPositionLimit);
	}

	public CommonFinancialInstrumentAttributes4 setNearTermPositionLimit(FinancialInstrumentQuantity1Choice nearTermPositionLimit) {
		this.nearTermPositionLimit = nearTermPositionLimit;
		return this;
	}

	public Optional<ISODate> getListingDate() {
		return listingDate == null ? Optional.empty() : Optional.of(listingDate);
	}

	public CommonFinancialInstrumentAttributes4 setListingDate(ISODate listingDate) {
		this.listingDate = listingDate;
		return this;
	}

	public Optional<ISODateTime> getRecordDate() {
		return recordDate == null ? Optional.empty() : Optional.of(recordDate);
	}

	public CommonFinancialInstrumentAttributes4 setRecordDate(ISODateTime recordDate) {
		this.recordDate = recordDate;
		return this;
	}

	public Optional<ISODate> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public CommonFinancialInstrumentAttributes4 setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<Max256Text> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public CommonFinancialInstrumentAttributes4 setPurpose(Max256Text purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<ClassificationType2> getClassificationType() {
		return classificationType == null ? Optional.empty() : Optional.of(classificationType);
	}

	public CommonFinancialInstrumentAttributes4 setClassificationType(ClassificationType2 classificationType) {
		this.classificationType = classificationType;
		return this;
	}

	public Optional<Issuance3> getIssuance() {
		return issuance == null ? Optional.empty() : Optional.of(issuance);
	}

	public CommonFinancialInstrumentAttributes4 setIssuance(Issuance3 issuance) {
		this.issuance = issuance;
		return this;
	}

	public List<TradingParameters1> getTradingMarket() {
		return tradingMarket == null ? tradingMarket = new ArrayList<>() : tradingMarket;
	}

	public CommonFinancialInstrumentAttributes4 setTradingMarket(List<TradingParameters1> tradingMarket) {
		this.tradingMarket = Objects.requireNonNull(tradingMarket);
		return this;
	}

	public List<BenchmarkCurve4> getSpreadAndBenchmarkCurve() {
		return spreadAndBenchmarkCurve == null ? spreadAndBenchmarkCurve = new ArrayList<>() : spreadAndBenchmarkCurve;
	}

	public CommonFinancialInstrumentAttributes4 setSpreadAndBenchmarkCurve(List<BenchmarkCurve4> spreadAndBenchmarkCurve) {
		this.spreadAndBenchmarkCurve = Objects.requireNonNull(spreadAndBenchmarkCurve);
		return this;
	}

	public Optional<PutType3Choice> getPutType() {
		return putType == null ? Optional.empty() : Optional.of(putType);
	}

	public CommonFinancialInstrumentAttributes4 setPutType(PutType3Choice putType) {
		this.putType = putType;
		return this;
	}

	public Optional<CallType3Choice> getCallType() {
		return callType == null ? Optional.empty() : Optional.of(callType);
	}

	public CommonFinancialInstrumentAttributes4 setCallType(CallType3Choice callType) {
		this.callType = callType;
		return this;
	}

	public Optional<YesNoIndicator> getFungibleIndicator() {
		return fungibleIndicator == null ? Optional.empty() : Optional.of(fungibleIndicator);
	}

	public CommonFinancialInstrumentAttributes4 setFungibleIndicator(YesNoIndicator fungibleIndicator) {
		this.fungibleIndicator = fungibleIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getConfidential() {
		return confidential == null ? Optional.empty() : Optional.of(confidential);
	}

	public CommonFinancialInstrumentAttributes4 setConfidential(YesNoIndicator confidential) {
		this.confidential = confidential;
		return this;
	}

	public Optional<YesNoIndicator> getPrivatePlacement() {
		return privatePlacement == null ? Optional.empty() : Optional.of(privatePlacement);
	}

	public CommonFinancialInstrumentAttributes4 setPrivatePlacement(YesNoIndicator privatePlacement) {
		this.privatePlacement = privatePlacement;
		return this;
	}

	public Optional<YesNoIndicator> getConvertibleIndicator() {
		return convertibleIndicator == null ? Optional.empty() : Optional.of(convertibleIndicator);
	}

	public CommonFinancialInstrumentAttributes4 setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
		return this;
	}

	public Optional<DateTimePeriodDetails> getConversionPeriod() {
		return conversionPeriod == null ? Optional.empty() : Optional.of(conversionPeriod);
	}

	public CommonFinancialInstrumentAttributes4 setConversionPeriod(DateTimePeriodDetails conversionPeriod) {
		this.conversionPeriod = conversionPeriod;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getConversionRatioNumerator() {
		return conversionRatioNumerator == null ? Optional.empty() : Optional.of(conversionRatioNumerator);
	}

	public CommonFinancialInstrumentAttributes4 setConversionRatioNumerator(FinancialInstrumentQuantity1Choice conversionRatioNumerator) {
		this.conversionRatioNumerator = conversionRatioNumerator;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getConversionRatioDenominator() {
		return conversionRatioDenominator == null ? Optional.empty() : Optional.of(conversionRatioDenominator);
	}

	public CommonFinancialInstrumentAttributes4 setConversionRatioDenominator(FinancialInstrumentQuantity1Choice conversionRatioDenominator) {
		this.conversionRatioDenominator = conversionRatioDenominator;
		return this;
	}

	public Optional<PartyIdentification71Choice> getPrimaryPlaceOfDeposit() {
		return primaryPlaceOfDeposit == null ? Optional.empty() : Optional.of(primaryPlaceOfDeposit);
	}

	public CommonFinancialInstrumentAttributes4 setPrimaryPlaceOfDeposit(PartyIdentification71Choice primaryPlaceOfDeposit) {
		this.primaryPlaceOfDeposit = primaryPlaceOfDeposit;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getTradingMethod() {
		return tradingMethod == null ? Optional.empty() : Optional.of(tradingMethod);
	}

	public CommonFinancialInstrumentAttributes4 setTradingMethod(UnitOrFaceAmount1Choice tradingMethod) {
		this.tradingMethod = tradingMethod;
		return this;
	}

	public Optional<TEFRARules3Choice> getTEFRARule() {
		return tEFRARule == null ? Optional.empty() : Optional.of(tEFRARule);
	}

	public CommonFinancialInstrumentAttributes4 setTEFRARule(TEFRARules3Choice tEFRARule) {
		this.tEFRARule = tEFRARule;
		return this;
	}

	public Optional<Max16Text> getSerieNumber() {
		return serieNumber == null ? Optional.empty() : Optional.of(serieNumber);
	}

	public CommonFinancialInstrumentAttributes4 setSerieNumber(Max16Text serieNumber) {
		this.serieNumber = serieNumber;
		return this;
	}

	public Optional<Max16Text> getClass_() {
		return class_ == null ? Optional.empty() : Optional.of(class_);
	}

	public CommonFinancialInstrumentAttributes4 setClass_(Max16Text class_) {
		this.class_ = class_;
		return this;
	}

	public List<SecurityWithHoldingTax1> getWithholdingTaxRegime() {
		return withholdingTaxRegime == null ? withholdingTaxRegime = new ArrayList<>() : withholdingTaxRegime;
	}

	public CommonFinancialInstrumentAttributes4 setWithholdingTaxRegime(List<SecurityWithHoldingTax1> withholdingTaxRegime) {
		this.withholdingTaxRegime = Objects.requireNonNull(withholdingTaxRegime);
		return this;
	}

	public Optional<SecuritiesPaymentStatus7Choice> getPaymentStatus() {
		return paymentStatus == null ? Optional.empty() : Optional.of(paymentStatus);
	}

	public CommonFinancialInstrumentAttributes4 setPaymentStatus(SecuritiesPaymentStatus7Choice paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}

	public Optional<InitialPhysicalForm4Choice> getInitialPhysicalForm() {
		return initialPhysicalForm == null ? Optional.empty() : Optional.of(initialPhysicalForm);
	}

	public CommonFinancialInstrumentAttributes4 setInitialPhysicalForm(InitialPhysicalForm4Choice initialPhysicalForm) {
		this.initialPhysicalForm = initialPhysicalForm;
		return this;
	}

	public Optional<InitialPhysicalForm3Choice> getAfterExchangePhysicalForm() {
		return afterExchangePhysicalForm == null ? Optional.empty() : Optional.of(afterExchangePhysicalForm);
	}

	public CommonFinancialInstrumentAttributes4 setAfterExchangePhysicalForm(InitialPhysicalForm3Choice afterExchangePhysicalForm) {
		this.afterExchangePhysicalForm = afterExchangePhysicalForm;
		return this;
	}

	public Optional<AnyBICIdentifier> getCommonSafekeeper() {
		return commonSafekeeper == null ? Optional.empty() : Optional.of(commonSafekeeper);
	}

	public CommonFinancialInstrumentAttributes4 setCommonSafekeeper(AnyBICIdentifier commonSafekeeper) {
		this.commonSafekeeper = commonSafekeeper;
		return this;
	}

	public Optional<MaturityRedemptionType3Choice> getRedemptionType() {
		return redemptionType == null ? Optional.empty() : Optional.of(redemptionType);
	}

	public CommonFinancialInstrumentAttributes4 setRedemptionType(MaturityRedemptionType3Choice redemptionType) {
		this.redemptionType = redemptionType;
		return this;
	}

	public Optional<ActiveCurrencyCode> getRedemptionPaymentCurrency() {
		return redemptionPaymentCurrency == null ? Optional.empty() : Optional.of(redemptionPaymentCurrency);
	}

	public CommonFinancialInstrumentAttributes4 setRedemptionPaymentCurrency(ActiveCurrencyCode redemptionPaymentCurrency) {
		this.redemptionPaymentCurrency = redemptionPaymentCurrency;
		return this;
	}

	public List<SecurityRestriction2> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public CommonFinancialInstrumentAttributes4 setRestriction(List<SecurityRestriction2> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public List<SettlementInformation17> getSettlementInformation() {
		return settlementInformation == null ? settlementInformation = new ArrayList<>() : settlementInformation;
	}

	public CommonFinancialInstrumentAttributes4 setSettlementInformation(List<SettlementInformation17> settlementInformation) {
		this.settlementInformation = Objects.requireNonNull(settlementInformation);
		return this;
	}

	public Optional<FinancialInstrumentForm2> getFinancialInstrumentForm() {
		return financialInstrumentForm == null ? Optional.empty() : Optional.of(financialInstrumentForm);
	}

	public CommonFinancialInstrumentAttributes4 setFinancialInstrumentForm(FinancialInstrumentForm2 financialInstrumentForm) {
		this.financialInstrumentForm = financialInstrumentForm;
		return this;
	}

	public Optional<Organisation27> getContactName() {
		return contactName == null ? Optional.empty() : Optional.of(contactName);
	}

	public CommonFinancialInstrumentAttributes4 setContactName(Organisation27 contactName) {
		this.contactName = contactName;
		return this;
	}

	public Optional<Organisation27> getLeadManager() {
		return leadManager == null ? Optional.empty() : Optional.of(leadManager);
	}

	public CommonFinancialInstrumentAttributes4 setLeadManager(Organisation27 leadManager) {
		this.leadManager = leadManager;
		return this;
	}

	public Optional<Organisation27> getPrincipalPayingAgent() {
		return principalPayingAgent == null ? Optional.empty() : Optional.of(principalPayingAgent);
	}

	public CommonFinancialInstrumentAttributes4 setPrincipalPayingAgent(Organisation27 principalPayingAgent) {
		this.principalPayingAgent = principalPayingAgent;
		return this;
	}

	public Optional<Organisation27> getPayingAgent() {
		return payingAgent == null ? Optional.empty() : Optional.of(payingAgent);
	}

	public CommonFinancialInstrumentAttributes4 setPayingAgent(Organisation27 payingAgent) {
		this.payingAgent = payingAgent;
		return this;
	}

	public Optional<Organisation27> getDepository() {
		return depository == null ? Optional.empty() : Optional.of(depository);
	}

	public CommonFinancialInstrumentAttributes4 setDepository(Organisation27 depository) {
		this.depository = depository;
		return this;
	}

	public Optional<Organisation27> getUnderlyingRisk() {
		return underlyingRisk == null ? Optional.empty() : Optional.of(underlyingRisk);
	}

	public CommonFinancialInstrumentAttributes4 setUnderlyingRisk(Organisation27 underlyingRisk) {
		this.underlyingRisk = underlyingRisk;
		return this;
	}
}