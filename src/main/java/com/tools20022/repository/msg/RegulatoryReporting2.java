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
import com.tools20022.repository.codeset.RegulatoryReportingType1Code;
import com.tools20022.repository.entity.RegulatoryReport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RegulatoryAuthority;
import com.tools20022.repository.msg.StructuredRegulatoryReporting2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information needed due to regulatory and/or statutory requirements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting2#mmDebitCreditReportingIndicator
 * RegulatoryReporting2.mmDebitCreditReportingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting2#mmAuthority
 * RegulatoryReporting2.mmAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting2#mmRegulatoryDetails
 * RegulatoryReporting2.mmRegulatoryDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RegulatoryReport
 * RegulatoryReport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegulatoryReporting2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information needed due to regulatory and/or statutory requirements."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegulatoryReporting2", propOrder = {"debitCreditReportingIndicator", "authority", "regulatoryDetails"})
public class RegulatoryReporting2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DbtCdtRptgInd")
	protected RegulatoryReportingType1Code debitCreditReportingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingType1Code
	 * RegulatoryReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmDebitCreditReportingIndicator
	 * RegulatoryReport.mmDebitCreditReportingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting2
	 * RegulatoryReporting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtCdtRptgInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCreditReportingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting2, Optional<RegulatoryReportingType1Code>> mmDebitCreditReportingIndicator = new MMMessageAttribute<RegulatoryReporting2, Optional<RegulatoryReportingType1Code>>() {
		{
			businessElementTrace_lazy = () -> RegulatoryReport.mmDebitCreditReportingIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting2.mmObject();
			isDerived = false;
			xmlTag = "DbtCdtRptgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditReportingIndicator";
			definition = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RegulatoryReportingType1Code.mmObject();
		}

		@Override
		public Optional<RegulatoryReportingType1Code> getValue(RegulatoryReporting2 obj) {
			return obj.getDebitCreditReportingIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting2 obj, Optional<RegulatoryReportingType1Code> value) {
			obj.setDebitCreditReportingIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Authrty")
	protected RegulatoryAuthority authority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RegulatoryAuthority
	 * RegulatoryAuthority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmAuthority
	 * RegulatoryReport.mmAuthority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting2
	 * RegulatoryReporting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authrty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity requiring the regulatory reporting information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RegulatoryReporting2, Optional<RegulatoryAuthority>> mmAuthority = new MMMessageAssociationEnd<RegulatoryReporting2, Optional<RegulatoryAuthority>>() {
		{
			businessElementTrace_lazy = () -> RegulatoryReport.mmAuthority;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting2.mmObject();
			isDerived = false;
			xmlTag = "Authrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authority";
			definition = "Entity requiring the regulatory reporting information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RegulatoryAuthority.mmObject();
		}

		@Override
		public Optional<RegulatoryAuthority> getValue(RegulatoryReporting2 obj) {
			return obj.getAuthority();
		}

		@Override
		public void setValue(RegulatoryReporting2 obj, Optional<RegulatoryAuthority> value) {
			obj.setAuthority(value.orElse(null));
		}
	};
	@XmlElement(name = "RgltryDtls")
	protected StructuredRegulatoryReporting2 regulatoryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting2
	 * StructuredRegulatoryReporting2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting2
	 * RegulatoryReporting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the regulatory reporting information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RegulatoryReporting2, Optional<StructuredRegulatoryReporting2>> mmRegulatoryDetails = new MMMessageAssociationEnd<RegulatoryReporting2, Optional<StructuredRegulatoryReporting2>>() {
		{
			businessComponentTrace_lazy = () -> RegulatoryReport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting2.mmObject();
			isDerived = false;
			xmlTag = "RgltryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryDetails";
			definition = "Details related to the regulatory reporting information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StructuredRegulatoryReporting2.mmObject();
		}

		@Override
		public Optional<StructuredRegulatoryReporting2> getValue(RegulatoryReporting2 obj) {
			return obj.getRegulatoryDetails();
		}

		@Override
		public void setValue(RegulatoryReporting2 obj, Optional<StructuredRegulatoryReporting2> value) {
			obj.setRegulatoryDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting2.mmDebitCreditReportingIndicator, com.tools20022.repository.msg.RegulatoryReporting2.mmAuthority,
						com.tools20022.repository.msg.RegulatoryReporting2.mmRegulatoryDetails);
				trace_lazy = () -> RegulatoryReport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReporting2";
				definition = "Information needed due to regulatory and/or statutory requirements.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RegulatoryReportingType1Code> getDebitCreditReportingIndicator() {
		return debitCreditReportingIndicator == null ? Optional.empty() : Optional.of(debitCreditReportingIndicator);
	}

	public RegulatoryReporting2 setDebitCreditReportingIndicator(RegulatoryReportingType1Code debitCreditReportingIndicator) {
		this.debitCreditReportingIndicator = debitCreditReportingIndicator;
		return this;
	}

	public Optional<RegulatoryAuthority> getAuthority() {
		return authority == null ? Optional.empty() : Optional.of(authority);
	}

	public RegulatoryReporting2 setAuthority(RegulatoryAuthority authority) {
		this.authority = authority;
		return this;
	}

	public Optional<StructuredRegulatoryReporting2> getRegulatoryDetails() {
		return regulatoryDetails == null ? Optional.empty() : Optional.of(regulatoryDetails);
	}

	public RegulatoryReporting2 setRegulatoryDetails(StructuredRegulatoryReporting2 regulatoryDetails) {
		this.regulatoryDetails = regulatoryDetails;
		return this;
	}
}