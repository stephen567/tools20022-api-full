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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.colr.*;
import com.tools20022.repository.choice.AgreementFramework1Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.entity.CollateralAgreement;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
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
 * Agreement details for the over the counter market.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementDetails
 * Agreement2.mmAgreementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementIdentification
 * Agreement2.mmAgreementIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementDate
 * Agreement2.mmAgreementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement2#mmBaseCurrency
 * Agreement2.mmBaseCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementFramework
 * Agreement2.mmAgreementFramework}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
 * CollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03#mmAgreement
 * CollateralSubstitutionRequestV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV03#mmAgreement
 * InterestPaymentStatementV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#mmAgreement
 * CollateralAndExposureReportV02.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmAgreement
 * MarginCallResponseV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmAgreement
 * MarginCallRequestV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV03#mmAgreement
 * CollateralProposalV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03#mmAgreement
 * CollateralSubstitutionResponseV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmAgreement
 * InterestPaymentResponseV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV03#mmAgreement
 * InterestPaymentRequestV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV03#mmAgreement
 * CollateralSubstitutionConfirmationV03.mmAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Agreement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Agreement details for the over the counter market."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement4 Agreement4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Agreement2", propOrder = {"agreementDetails", "agreementIdentification", "agreementDate", "baseCurrency", "agreementFramework"})
public class Agreement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AgrmtDtls", required = true)
	protected Max140Text agreementDetails;
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
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDescription
	 * Agreement.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement2
	 * Agreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full details of the supporting legal agreement under which the margin call can be issued and/or governed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementDetails
	 * Agreement4.mmAgreementDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement2, Max140Text> mmAgreementDetails = new MMMessageAttribute<Agreement2, Max140Text>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement2.mmObject();
			isDerived = false;
			xmlTag = "AgrmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementDetails";
			definition = "Full details of the supporting legal agreement under which the margin call can be issued and/or governed.";
			nextVersions_lazy = () -> Arrays.asList(Agreement4.mmAgreementDetails);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(Agreement2 obj) {
			return obj.getAgreementDetails();
		}

		@Override
		public void setValue(Agreement2 obj, Max140Text value) {
			obj.setAgreementDetails(value);
		}
	};
	@XmlElement(name = "AgrmtId")
	protected Max140Text agreementIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement2
	 * Agreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common reference to the agreement between the two counterparties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementIdentification
	 * Agreement4.mmAgreementIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement2, Optional<Max140Text>> mmAgreementIdentification = new MMMessageAttribute<Agreement2, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement2.mmObject();
			isDerived = false;
			xmlTag = "AgrmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementIdentification";
			definition = "Common reference to the agreement between the two counterparties.";
			nextVersions_lazy = () -> Arrays.asList(Agreement4.mmAgreementIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(Agreement2 obj) {
			return obj.getAgreementIdentification();
		}

		@Override
		public void setValue(Agreement2 obj, Optional<Max140Text> value) {
			obj.setAgreementIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AgrmtDt", required = true)
	protected ISODate agreementDate;
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
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
	 * Agreement.mmDateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement2
	 * Agreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the collateral agreement was signed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementDate
	 * Agreement4.mmAgreementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement2, ISODate> mmAgreementDate = new MMMessageAttribute<Agreement2, ISODate>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDateSigned;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement2.mmObject();
			isDerived = false;
			xmlTag = "AgrmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementDate";
			definition = "Date on which the collateral agreement was signed.";
			nextVersions_lazy = () -> Arrays.asList(Agreement4.mmAgreementDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Agreement2 obj) {
			return obj.getAgreementDate();
		}

		@Override
		public void setValue(Agreement2 obj, ISODate value) {
			obj.setAgreementDate(value);
		}
	};
	@XmlElement(name = "BaseCcy", required = true)
	protected CurrencyCode baseCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmBaseCurrency
	 * CollateralAgreement.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement2
	 * Agreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BaseCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Denomination currency as specified in the collateral agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement4#mmBaseCurrency
	 * Agreement4.mmBaseCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement2, CurrencyCode> mmBaseCurrency = new MMMessageAttribute<Agreement2, CurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CollateralAgreement.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement2.mmObject();
			isDerived = false;
			xmlTag = "BaseCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCurrency";
			definition = "Denomination currency as specified in the collateral agreement.";
			nextVersions_lazy = () -> Arrays.asList(Agreement4.mmBaseCurrency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Agreement2 obj) {
			return obj.getBaseCurrency();
		}

		@Override
		public void setValue(Agreement2 obj, CurrencyCode value) {
			obj.setBaseCurrency(value);
		}
	};
	@XmlElement(name = "AgrmtFrmwk")
	protected AgreementFramework1Choice agreementFramework;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AgreementFramework1Choice
	 * AgreementFramework1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmAssociatedMasterAgreement
	 * CollateralAgreement.mmAssociatedMasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement2
	 * Agreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtFrmwk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying master agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementFramework
	 * Agreement4.mmAgreementFramework}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement2, Optional<AgreementFramework1Choice>> mmAgreementFramework = new MMMessageAttribute<Agreement2, Optional<AgreementFramework1Choice>>() {
		{
			businessElementTrace_lazy = () -> CollateralAgreement.mmAssociatedMasterAgreement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement2.mmObject();
			isDerived = false;
			xmlTag = "AgrmtFrmwk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementFramework";
			definition = "Specifies the underlying master agreement.";
			nextVersions_lazy = () -> Arrays.asList(Agreement4.mmAgreementFramework);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AgreementFramework1Choice.mmObject();
		}

		@Override
		public Optional<AgreementFramework1Choice> getValue(Agreement2 obj) {
			return obj.getAgreementFramework();
		}

		@Override
		public void setValue(Agreement2 obj, Optional<AgreementFramework1Choice> value) {
			obj.setAgreementFramework(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Agreement2.mmAgreementDetails, com.tools20022.repository.msg.Agreement2.mmAgreementIdentification,
						com.tools20022.repository.msg.Agreement2.mmAgreementDate, com.tools20022.repository.msg.Agreement2.mmBaseCurrency, com.tools20022.repository.msg.Agreement2.mmAgreementFramework);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV03.mmAgreement, InterestPaymentStatementV03.mmAgreement, CollateralAndExposureReportV02.mmAgreement, MarginCallResponseV03.mmAgreement,
						MarginCallRequestV03.mmAgreement, CollateralProposalV03.mmAgreement, CollateralSubstitutionResponseV03.mmAgreement, InterestPaymentResponseV03.mmAgreement, InterestPaymentRequestV03.mmAgreement,
						CollateralSubstitutionConfirmationV03.mmAgreement);
				trace_lazy = () -> CollateralAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Agreement2";
				definition = "Agreement details for the over the counter market.";
				nextVersions_lazy = () -> Arrays.asList(Agreement4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getAgreementDetails() {
		return agreementDetails;
	}

	public Agreement2 setAgreementDetails(Max140Text agreementDetails) {
		this.agreementDetails = Objects.requireNonNull(agreementDetails);
		return this;
	}

	public Optional<Max140Text> getAgreementIdentification() {
		return agreementIdentification == null ? Optional.empty() : Optional.of(agreementIdentification);
	}

	public Agreement2 setAgreementIdentification(Max140Text agreementIdentification) {
		this.agreementIdentification = agreementIdentification;
		return this;
	}

	public ISODate getAgreementDate() {
		return agreementDate;
	}

	public Agreement2 setAgreementDate(ISODate agreementDate) {
		this.agreementDate = Objects.requireNonNull(agreementDate);
		return this;
	}

	public CurrencyCode getBaseCurrency() {
		return baseCurrency;
	}

	public Agreement2 setBaseCurrency(CurrencyCode baseCurrency) {
		this.baseCurrency = Objects.requireNonNull(baseCurrency);
		return this;
	}

	public Optional<AgreementFramework1Choice> getAgreementFramework() {
		return agreementFramework == null ? Optional.empty() : Optional.of(agreementFramework);
	}

	public Agreement2 setAgreementFramework(AgreementFramework1Choice agreementFramework) {
		this.agreementFramework = agreementFramework;
		return this;
	}
}