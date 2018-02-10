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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.PartyIdentification23Choice;
import com.tools20022.repository.choice.PartyIdentification24Choice;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.TransactionDetails3;
import com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A reporting institution, eg, an investment bank, sends the
 * RegulatoryTransactionReport to a regulator or an intermediary (eg a reporting
 * agent), to report the transaction details of a trade that has been executed
 * on or off-exchange.<br>
 * <b>Usage</b><br>
 * The message definition can be used to report more than one transaction. The
 * message definition can also be used to specify, on a trade by trade basis, to
 * which authorities the transaction report(s) need to be sent using the
 * TransactionReportMarker.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02#mmIdentification
 * RegulatoryTransactionReportV02.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02#mmTransactionDetails
 * RegulatoryTransactionReportV02.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02#mmReportingInstitution
 * RegulatoryTransactionReportV02.mmReportingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02#mmReportingAgent
 * RegulatoryTransactionReportV02.mmReportingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02#mmExtension
 * RegulatoryTransactionReportV02.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive
 * TransactionRegulatoryReportingISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RgltryTxRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.008.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegulatoryTransactionReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA reporting institution, eg, an investment bank, sends the RegulatoryTransactionReport to a regulator or an intermediary (eg a reporting agent), to report the transaction details of a trade that has been executed on or off-exchange.\r\nUsage\r\nThe message definition can be used to report more than one transaction. The message definition can also be used to specify, on a trade by trade basis, to which authorities the transaction report(s) need to be sent using the TransactionReportMarker."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegulatoryTransactionReportV02", propOrder = {"identification", "transactionDetails", "reportingInstitution", "reportingAgent", "extension"})
public class RegulatoryTransactionReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification8 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the RegulatoryTransactionReport."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the RegulatoryTransactionReport.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryTransactionReportV02.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxDtls", required = true)
	protected List<TransactionDetails3> transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the trade for which the transaction report is being sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Provides details of the trade for which the transaction report is being sent.";
			minOccurs = 1;
			complexType_lazy = () -> TransactionDetails3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryTransactionReportV02.class.getMethod("getTransactionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RptgInstn", required = true)
	protected PartyIdentification23Choice reportingInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification23Choice
	 * PartyIdentification23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgInstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the firm that is legally responsible for sending the transaction report.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportingInstitution = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingInstitution";
			definition = "Identification of the firm that is legally responsible for sending the transaction report.\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification23Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryTransactionReportV02.class.getMethod("getReportingInstitution", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RptgAgt")
	protected PartyIdentification24Choice reportingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification24Choice
	 * PartyIdentification24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the intermediary which is reporting on behalf on the ReportingInstitution. If there is a reporting chain, then the last party should override the previous one."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingAgent";
			definition = "Identifies the intermediary which is reporting on behalf on the ReportingInstitution. If there is a reporting chain, then the last party should override the previous one.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification24Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryTransactionReportV02.class.getMethod("getReportingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryTransactionReportV02.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryTransactionReportV02";
				definition = "Scope\r\nA reporting institution, eg, an investment bank, sends the RegulatoryTransactionReport to a regulator or an intermediary (eg a reporting agent), to report the transaction details of a trade that has been executed on or off-exchange.\r\nUsage\r\nThe message definition can be used to report more than one transaction. The message definition can also be used to specify, on a trade by trade basis, to which authorities the transaction report(s) need to be sent using the TransactionReportMarker.";
				messageSet_lazy = () -> Arrays.asList(TransactionRegulatoryReportingISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "RgltryTxRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportV02.mmIdentification, com.tools20022.repository.area.auth.RegulatoryTransactionReportV02.mmTransactionDetails,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportV02.mmReportingInstitution, com.tools20022.repository.area.auth.RegulatoryTransactionReportV02.mmReportingAgent,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportV02.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "008";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RegulatoryTransactionReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public RegulatoryTransactionReportV02 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<TransactionDetails3> getTransactionDetails() {
		return transactionDetails == null ? transactionDetails = new ArrayList<>() : transactionDetails;
	}

	public RegulatoryTransactionReportV02 setTransactionDetails(List<TransactionDetails3> transactionDetails) {
		this.transactionDetails = Objects.requireNonNull(transactionDetails);
		return this;
	}

	public PartyIdentification23Choice getReportingInstitution() {
		return reportingInstitution;
	}

	public RegulatoryTransactionReportV02 setReportingInstitution(PartyIdentification23Choice reportingInstitution) {
		this.reportingInstitution = Objects.requireNonNull(reportingInstitution);
		return this;
	}

	public Optional<PartyIdentification24Choice> getReportingAgent() {
		return reportingAgent == null ? Optional.empty() : Optional.of(reportingAgent);
	}

	public RegulatoryTransactionReportV02 setReportingAgent(PartyIdentification24Choice reportingAgent) {
		this.reportingAgent = reportingAgent;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public RegulatoryTransactionReportV02 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.008.001.02")
	static public class Document {
		@XmlElement(name = "RgltryTxRpt", required = true)
		public RegulatoryTransactionReportV02 messageBody;
	}
}