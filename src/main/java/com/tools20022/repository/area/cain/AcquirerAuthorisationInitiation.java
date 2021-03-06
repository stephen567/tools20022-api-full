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

package com.tools20022.repository.area.cain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AcquirertoIssuerCardTransactionLatestVersion;
import com.tools20022.repository.msg.AcquirerAuthorisationInitiation1;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header17;
import com.tools20022.repository.msgset.AcquirertoIssuerCardMessagesISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The AcquirerAuthorisationInitiation message is sent by an acquirer or an
 * agent to an issuer or an agent, to request, advice or notify the approval of
 * a card transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code cain.001.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcquirertoIssuerCardTransactionLatestVersion
 * AcquirertoIssuerCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation#mmHeader
 * AcquirerAuthorisationInitiation.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation#mmAuthorisationInitiation
 * AcquirerAuthorisationInitiation.mmAuthorisationInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation#mmSecurityTrailer
 * AcquirerAuthorisationInitiation.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.AcquirertoIssuerCardMessagesISOLatestversion
 * AcquirertoIssuerCardMessagesISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcqrrAuthstnInitn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcquirerAuthorisationInitiation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcquirerAuthorisationInitiation message is sent by an acquirer or an agent to an issuer or an agent, to request, advice or notify the approval of a card transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerAuthorisationInitiation", propOrder = {"header", "authorisationInitiation", "securityTrailer"})
public class AcquirerAuthorisationInitiation {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header17 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header17
	 * Header17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the protocol management."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcquirerAuthorisationInitiation, Header17> mmHeader = new MMMessageBuildingBlock<AcquirerAuthorisationInitiation, Header17>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header17.mmObject();
		}

		@Override
		public Header17 getValue(AcquirerAuthorisationInitiation obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcquirerAuthorisationInitiation obj, Header17 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "AuthstnInitn", required = true)
	protected AcquirerAuthorisationInitiation1 authorisationInitiation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationInitiation1
	 * AcquirerAuthorisationInitiation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnInitn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationInitiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the authorisation initiation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcquirerAuthorisationInitiation, AcquirerAuthorisationInitiation1> mmAuthorisationInitiation = new MMMessageBuildingBlock<AcquirerAuthorisationInitiation, AcquirerAuthorisationInitiation1>() {
		{
			xmlTag = "AuthstnInitn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationInitiation";
			definition = "Information related to the authorisation initiation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcquirerAuthorisationInitiation1.mmObject();
		}

		@Override
		public AcquirerAuthorisationInitiation1 getValue(AcquirerAuthorisationInitiation obj) {
			return obj.getAuthorisationInitiation();
		}

		@Override
		public void setValue(AcquirerAuthorisationInitiation obj, AcquirerAuthorisationInitiation1 value) {
			obj.setAuthorisationInitiation(value);
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType15 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trailer of the message containing a MAC.\r\nIt corresponds patially to ISO 8583 field number 53, completed by the field number 64 or 128."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcquirerAuthorisationInitiation, Optional<ContentInformationType15>> mmSecurityTrailer = new MMMessageBuildingBlock<AcquirerAuthorisationInitiation, Optional<ContentInformationType15>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.\r\nIt corresponds patially to ISO 8583 field number 53, completed by the field number 64 or 128.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}

		@Override
		public Optional<ContentInformationType15> getValue(AcquirerAuthorisationInitiation obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcquirerAuthorisationInitiation obj, Optional<ContentInformationType15> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerAuthorisationInitiation";
				definition = "The AcquirerAuthorisationInitiation message is sent by an acquirer or an agent to an issuer or an agent, to request, advice or notify the approval of a card transaction.";
				messageSet_lazy = () -> Arrays.asList(AcquirertoIssuerCardMessagesISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcqrrAuthstnInitn";
				businessArea_lazy = () -> AcquirertoIssuerCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation.mmHeader, com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation.mmAuthorisationInitiation,
						com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "cain";
						messageFunctionality = "001";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcquirerAuthorisationInitiation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header17 getHeader() {
		return header;
	}

	public AcquirerAuthorisationInitiation setHeader(Header17 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcquirerAuthorisationInitiation1 getAuthorisationInitiation() {
		return authorisationInitiation;
	}

	public AcquirerAuthorisationInitiation setAuthorisationInitiation(AcquirerAuthorisationInitiation1 authorisationInitiation) {
		this.authorisationInitiation = Objects.requireNonNull(authorisationInitiation);
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public AcquirerAuthorisationInitiation setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.001.001.01")
	static public class Document {
		@XmlElement(name = "AcqrrAuthstnInitn", required = true)
		public AcquirerAuthorisationInitiation messageBody;
	}
}