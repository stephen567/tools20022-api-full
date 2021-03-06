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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat28Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action confirmation
 * securities movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmPlaceAndName
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmCreditDebitIndicator
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.
 * mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmTransactionQuantity
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmTransactionQuantity
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmReasonCode
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmSubReasonCode
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmSubReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmContraParticipantNumber
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.
 * mmContraParticipantNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmMaturityDate
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmPostingDate
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmPostingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmTaxAdjustmentRate
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmTaxAdjustmentRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionConfirmationSecuritiesMovementDetailsSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action confirmation securities movement details."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3
 * CorporateActionConfirmationSecuritiesMovementDetailsSD3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1
 * CorporateActionConfirmationSecuritiesMovementDetailsSD1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionConfirmationSecuritiesMovementDetailsSD2", propOrder = {"placeAndName", "creditDebitIndicator", "transactionQuantity", "reasonCode", "subReasonCode", "contraParticipantNumber", "maturityDate", "postingDate",
		"taxAdjustmentRate"})
public class CorporateActionConfirmationSecuritiesMovementDetailsSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmPlaceAndName
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmPlaceAndName
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmPlaceAndName);
			previousVersion_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the value is a debit or a credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Credit / Debit Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmCreditDebitIndicator
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.
	 * mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmCreditDebitIndicator
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.
	 * mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, CreditDebitCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Credit / Debit Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or a credit.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmCreditDebitIndicator);
			previousVersion_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "TxQty")
	protected FinancialInstrumentQuantity15Choice transactionQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Resulting quantity of securities concerned in this transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Transaction Securities Quantity</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmTransactionQuantity
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.
	 * mmTransactionQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmTransactionQuantity
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.
	 * mmTransactionQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<FinancialInstrumentQuantity15Choice>> mmTransactionQuantity = new MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxQty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Securities Quantity"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantity";
			definition = "Resulting quantity of securities concerned in this transaction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmTransactionQuantity);
			previousVersion_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmTransactionQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj) {
			return obj.getTransactionQuantity();
		}

		@Override
		public void setValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setTransactionQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "RsnCd")
	protected DTCAdjustmentPaymentType2Code reasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsnCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Transaction Reason Code</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmReasonCode
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmReasonCode
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<DTCAdjustmentPaymentType2Code>> mmReasonCode = new MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<DTCAdjustmentPaymentType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "RsnCd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Reason Code"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonCode";
			definition = "Transaction reason.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmReasonCode);
			previousVersion_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmReasonCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentType2Code.mmObject();
		}

		@Override
		public Optional<DTCAdjustmentPaymentType2Code> getValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj) {
			return obj.getReasonCode();
		}

		@Override
		public void setValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj, Optional<DTCAdjustmentPaymentType2Code> value) {
			obj.setReasonCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SubRsnCd")
	protected DTCAdjustmentPaymentSubReason1Code subReasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubRsnCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction sub reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmSubReasonCode
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmSubReasonCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<DTCAdjustmentPaymentSubReason1Code>> mmSubReasonCode = new MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<DTCAdjustmentPaymentSubReason1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "SubRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubReasonCode";
			definition = "Transaction sub reason.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmSubReasonCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentSubReason1Code.mmObject();
		}

		@Override
		public Optional<DTCAdjustmentPaymentSubReason1Code> getValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj) {
			return obj.getSubReasonCode();
		}

		@Override
		public void setValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj, Optional<DTCAdjustmentPaymentSubReason1Code> value) {
			obj.setSubReasonCode(value.orElse(null));
		}
	};
	@XmlElement(name = "ContraPtcptNb")
	protected Max8Text contraParticipantNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ContraPtcptNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraParticipantNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction contra participant identification when shares are distributed / delivered to / from another participant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Contra Participant Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmContraParticipantNumber
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.
	 * mmContraParticipantNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmContraParticipantNumber
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.
	 * mmContraParticipantNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<Max8Text>> mmContraParticipantNumber = new MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<Max8Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contra Participant Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification when shares are distributed / delivered to / from another participant.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmContraParticipantNumber);
			previousVersion_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmContraParticipantNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}

		@Override
		public Optional<Max8Text> getValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj) {
			return obj.getContraParticipantNumber();
		}

		@Override
		public void setValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj, Optional<Max8Text> value) {
			obj.setContraParticipantNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISODate maturityDate;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a financial instrument becomes due and assets are to be repaid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::MATU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmMaturityDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<ISODate>> mmMaturityDate = new MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::MATU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which a financial instrument becomes due and assets are to be repaid.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmMaturityDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj, Optional<ISODate> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PstngDt")
	protected DateFormat28Choice postingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat28Choice
	 * DateFormat28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time on which the posting /draft of the securities took place."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payable Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmPostingDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmPostingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmPostingDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmPostingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<DateFormat28Choice>> mmPostingDate = new MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<DateFormat28Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PstngDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payable Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingDate";
			definition = "Date/Time on which the posting /draft of the securities took place.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmPostingDate);
			previousVersion_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmPostingDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat28Choice.mmObject();
		}

		@Override
		public Optional<DateFormat28Choice> getValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj) {
			return obj.getPostingDate();
		}

		@Override
		public void setValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj, Optional<DateFormat28Choice> value) {
			obj.setPostingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxAdjstmntRate")
	protected PercentageRate taxAdjustmentRate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAdjstmntRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAdjustmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of the DTC legacy sub reason codes representing tax rate. Used with reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify the correct tax rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmTaxAdjustmentRate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.
	 * mmTaxAdjustmentRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<PercentageRate>> mmTaxAdjustmentRate = new MMMessageAttribute<CorporateActionConfirmationSecuritiesMovementDetailsSD2, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TaxAdjstmntRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdjustmentRate";
			definition = "Set of the DTC legacy sub reason codes representing tax rate. Used with reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify the correct tax rate.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmTaxAdjustmentRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj) {
			return obj.getTaxAdjustmentRate();
		}

		@Override
		public void setValue(CorporateActionConfirmationSecuritiesMovementDetailsSD2 obj, Optional<PercentageRate> value) {
			obj.setTaxAdjustmentRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmCreditDebitIndicator,
						com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmTransactionQuantity, com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmReasonCode,
						com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmSubReasonCode, com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmContraParticipantNumber,
						com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmMaturityDate, com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmPostingDate,
						com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmTaxAdjustmentRate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionConfirmationSecuritiesMovementDetailsSD2";
				definition = "Provides additional information regarding corporate action confirmation securities movement details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmObject());
				previousVersion_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionConfirmationSecuritiesMovementDetailsSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public CorporateActionConfirmationSecuritiesMovementDetailsSD2 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getTransactionQuantity() {
		return transactionQuantity == null ? Optional.empty() : Optional.of(transactionQuantity);
	}

	public CorporateActionConfirmationSecuritiesMovementDetailsSD2 setTransactionQuantity(FinancialInstrumentQuantity15Choice transactionQuantity) {
		this.transactionQuantity = transactionQuantity;
		return this;
	}

	public Optional<DTCAdjustmentPaymentType2Code> getReasonCode() {
		return reasonCode == null ? Optional.empty() : Optional.of(reasonCode);
	}

	public CorporateActionConfirmationSecuritiesMovementDetailsSD2 setReasonCode(DTCAdjustmentPaymentType2Code reasonCode) {
		this.reasonCode = reasonCode;
		return this;
	}

	public Optional<DTCAdjustmentPaymentSubReason1Code> getSubReasonCode() {
		return subReasonCode == null ? Optional.empty() : Optional.of(subReasonCode);
	}

	public CorporateActionConfirmationSecuritiesMovementDetailsSD2 setSubReasonCode(DTCAdjustmentPaymentSubReason1Code subReasonCode) {
		this.subReasonCode = subReasonCode;
		return this;
	}

	public Optional<Max8Text> getContraParticipantNumber() {
		return contraParticipantNumber == null ? Optional.empty() : Optional.of(contraParticipantNumber);
	}

	public CorporateActionConfirmationSecuritiesMovementDetailsSD2 setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
		return this;
	}

	public Optional<ISODate> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public CorporateActionConfirmationSecuritiesMovementDetailsSD2 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<DateFormat28Choice> getPostingDate() {
		return postingDate == null ? Optional.empty() : Optional.of(postingDate);
	}

	public CorporateActionConfirmationSecuritiesMovementDetailsSD2 setPostingDate(DateFormat28Choice postingDate) {
		this.postingDate = postingDate;
		return this;
	}

	public Optional<PercentageRate> getTaxAdjustmentRate() {
		return taxAdjustmentRate == null ? Optional.empty() : Optional.of(taxAdjustmentRate);
	}

	public CorporateActionConfirmationSecuritiesMovementDetailsSD2 setTaxAdjustmentRate(PercentageRate taxAdjustmentRate) {
		this.taxAdjustmentRate = taxAdjustmentRate;
		return this;
	}
}