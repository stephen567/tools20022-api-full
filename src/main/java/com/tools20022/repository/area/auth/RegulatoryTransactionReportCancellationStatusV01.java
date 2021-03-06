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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.PartyIdentification23Choice;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msg.ReportStatusAndReason2;
import com.tools20022.repository.msg.TradeTransactionStatusAndReason2;
import com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A regulator or an intermediary sends the
 * RegulatoryTransactionReportCancellationStatus to a reporting institution to
 * provide the status of a RegulatoryTransactionReportCancellationRequest
 * previously sent by the reporting institution.<br>
 * <b>Usage</b><br>
 * The message definition may be used to provide a status for the entire report
 * or to provide a status at the level of individual transactions within the
 * report. One of the following statuses can be reported:<br>
 * - Completed, or,<br>
 * - Pending, or,<br>
 * - Rejected.<br>
 * If the status is rejected, then reason for the rejection must be specified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.011.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#ReportCancellationStatusOrIndividualTransactionCancellationStatusRule
 * RegulatoryTransactionReportCancellationStatusV01.
 * ReportCancellationStatusOrIndividualTransactionCancellationStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmIdentification
 * RegulatoryTransactionReportCancellationStatusV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmReportingInstitution
 * RegulatoryTransactionReportCancellationStatusV01.mmReportingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmReportCancellationStatus
 * RegulatoryTransactionReportCancellationStatusV01.mmReportCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmIndividualTransactionCancellationStatus
 * RegulatoryTransactionReportCancellationStatusV01.
 * mmIndividualTransactionCancellationStatus}</li>
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
 * xmlTag} = "RgltryTxRptCxlStsV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegulatoryTransactionReportCancellationStatusV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA regulator or an intermediary sends the RegulatoryTransactionReportCancellationStatus to a reporting institution to provide the status of a RegulatoryTransactionReportCancellationRequest previously sent by the reporting institution.\r\nUsage\r\nThe message definition may be used to provide a status for the entire report or to provide a status at the level of individual transactions within the report. One of the following statuses can be reported:\r\n- Completed, or,\r\n- Pending, or,\r\n- Rejected.\r\nIf the status is rejected, then reason for the rejection must be specified."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegulatoryTransactionReportCancellationStatusV01", propOrder = {"identification", "reportingInstitution", "reportCancellationStatus", "individualTransactionCancellationStatus"})
public class RegulatoryTransactionReportCancellationStatusV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either ReportCancellationStatus or
	 * IndividualTransactionCancellationStatus must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01
	 * RegulatoryTransactionReportCancellationStatusV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmReportCancellationStatus
	 * RegulatoryTransactionReportCancellationStatusV01.
	 * mmReportCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmIndividualTransactionCancellationStatus
	 * RegulatoryTransactionReportCancellationStatusV01.
	 * mmIndividualTransactionCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "ReportCancellationStatusOrIndividualTransactionCancellationStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either ReportCancellationStatus or IndividualTransactionCancellationStatus must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor ReportCancellationStatusOrIndividualTransactionCancellationStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportCancellationStatusOrIndividualTransactionCancellationStatusRule";
			definition = "Either ReportCancellationStatus or IndividualTransactionCancellationStatus must be present, but not both.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmReportCancellationStatus,
					com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmIndividualTransactionCancellationStatus);
			messageDefinition_lazy = () -> com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the RegulatoryTransactionReportCancellationStatus document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RegulatoryTransactionReportCancellationStatusV01, DocumentIdentification8> mmIdentification = new MMMessageBuildingBlock<RegulatoryTransactionReportCancellationStatusV01, DocumentIdentification8>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the RegulatoryTransactionReportCancellationStatus document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(RegulatoryTransactionReportCancellationStatusV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(RegulatoryTransactionReportCancellationStatusV01 obj, DocumentIdentification8 value) {
			obj.setIdentification(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the firm that executed the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RegulatoryTransactionReportCancellationStatusV01, PartyIdentification23Choice> mmReportingInstitution = new MMMessageBuildingBlock<RegulatoryTransactionReportCancellationStatusV01, PartyIdentification23Choice>() {
		{
			xmlTag = "RptgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingInstitution";
			definition = "Identification of the firm that executed the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification23Choice.mmObject();
		}

		@Override
		public PartyIdentification23Choice getValue(RegulatoryTransactionReportCancellationStatusV01 obj) {
			return obj.getReportingInstitution();
		}

		@Override
		public void setValue(RegulatoryTransactionReportCancellationStatusV01 obj, PartyIdentification23Choice value) {
			obj.setReportingInstitution(value);
		}
	};
	@XmlElement(name = "RptCxlSts", required = true)
	protected ReportStatusAndReason2 reportCancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReportStatusAndReason2
	 * ReportStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptCxlSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the entire RegulatoryTransactionReportCancellationRequest document that was previously sent by a reporting institution.\n\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RegulatoryTransactionReportCancellationStatusV01, ReportStatusAndReason2> mmReportCancellationStatus = new MMMessageBuildingBlock<RegulatoryTransactionReportCancellationStatusV01, ReportStatusAndReason2>() {
		{
			xmlTag = "RptCxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportCancellationStatus";
			definition = "Provides the status of the entire RegulatoryTransactionReportCancellationRequest document that was previously sent by a reporting institution.\n\n.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportStatusAndReason2.mmObject();
		}

		@Override
		public ReportStatusAndReason2 getValue(RegulatoryTransactionReportCancellationStatusV01 obj) {
			return obj.getReportCancellationStatus();
		}

		@Override
		public void setValue(RegulatoryTransactionReportCancellationStatusV01 obj, ReportStatusAndReason2 value) {
			obj.setReportCancellationStatus(value);
		}
	};
	@XmlElement(name = "IndvTxCxlSts", required = true)
	protected List<TradeTransactionStatusAndReason2> individualTransactionCancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2
	 * TradeTransactionStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvTxCxlSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualTransactionCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the cancellation status of one or more transactions within a RegulatoryTransactionReportCancellationRequest that was previously sent by a reporting institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RegulatoryTransactionReportCancellationStatusV01, List<TradeTransactionStatusAndReason2>> mmIndividualTransactionCancellationStatus = new MMMessageBuildingBlock<RegulatoryTransactionReportCancellationStatusV01, List<TradeTransactionStatusAndReason2>>() {
		{
			xmlTag = "IndvTxCxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTransactionCancellationStatus";
			definition = "Provides the cancellation status of one or more transactions within a RegulatoryTransactionReportCancellationRequest that was previously sent by a reporting institution.";
			minOccurs = 1;
			complexType_lazy = () -> TradeTransactionStatusAndReason2.mmObject();
		}

		@Override
		public List<TradeTransactionStatusAndReason2> getValue(RegulatoryTransactionReportCancellationStatusV01 obj) {
			return obj.getIndividualTransactionCancellationStatus();
		}

		@Override
		public void setValue(RegulatoryTransactionReportCancellationStatusV01 obj, List<TradeTransactionStatusAndReason2> value) {
			obj.setIndividualTransactionCancellationStatus(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryTransactionReportCancellationStatusV01";
				definition = "Scope\r\nA regulator or an intermediary sends the RegulatoryTransactionReportCancellationStatus to a reporting institution to provide the status of a RegulatoryTransactionReportCancellationRequest previously sent by the reporting institution.\r\nUsage\r\nThe message definition may be used to provide a status for the entire report or to provide a status at the level of individual transactions within the report. One of the following statuses can be reported:\r\n- Completed, or,\r\n- Pending, or,\r\n- Rejected.\r\nIf the status is rejected, then reason for the rejection must be specified.";
				messageSet_lazy = () -> Arrays.asList(TransactionRegulatoryReportingISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.ReportCancellationStatusOrIndividualTransactionCancellationStatusRule);
				rootElement = "Document";
				xmlTag = "RgltryTxRptCxlStsV01";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmIdentification,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmReportingInstitution,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmReportCancellationStatus,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmIndividualTransactionCancellationStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "011";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RegulatoryTransactionReportCancellationStatusV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public RegulatoryTransactionReportCancellationStatusV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public PartyIdentification23Choice getReportingInstitution() {
		return reportingInstitution;
	}

	public RegulatoryTransactionReportCancellationStatusV01 setReportingInstitution(PartyIdentification23Choice reportingInstitution) {
		this.reportingInstitution = Objects.requireNonNull(reportingInstitution);
		return this;
	}

	public ReportStatusAndReason2 getReportCancellationStatus() {
		return reportCancellationStatus;
	}

	public RegulatoryTransactionReportCancellationStatusV01 setReportCancellationStatus(ReportStatusAndReason2 reportCancellationStatus) {
		this.reportCancellationStatus = Objects.requireNonNull(reportCancellationStatus);
		return this;
	}

	public List<TradeTransactionStatusAndReason2> getIndividualTransactionCancellationStatus() {
		return individualTransactionCancellationStatus == null ? individualTransactionCancellationStatus = new ArrayList<>() : individualTransactionCancellationStatus;
	}

	public RegulatoryTransactionReportCancellationStatusV01 setIndividualTransactionCancellationStatus(List<TradeTransactionStatusAndReason2> individualTransactionCancellationStatus) {
		this.individualTransactionCancellationStatus = Objects.requireNonNull(individualTransactionCancellationStatus);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.011.001.01")
	static public class Document {
		@XmlElement(name = "RgltryTxRptCxlStsV01", required = true)
		public RegulatoryTransactionReportCancellationStatusV01 messageBody;
	}
}