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

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.TradeServicesManagementLatestVersion;
import com.tools20022.repository.choice.RejectionReason1Choice;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.SimpleIdentificationInformation;
import com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The MisMatchRejection message is sent by the party requested to accept or
 * reject data set mis-matches to the matching application.<br>
 * This message is used to reject mis-matches between data sets and the related
 * baseline.<br>
 * <b>Usage</b><br>
 * The MisMatchRejection message can be sent by the party requested to accept or
 * reject data set mis-match to inform that it rejects the data set(s).<br>
 * The message can be sent in response to a DataSetMatchReport message conveying
 * mis-matches.<br>
 * The information about the rejection of the mis-matched data sets will be
 * forwarded by the matching application to the submitter of the data sets by a
 * MisMatchRejectionNotification message.<br>
 * The acceptance of mis-matched data sets can be achieved by sending a
 * MisMatchAcceptance message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion
 * TradeServicesManagementISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion
 * TradeServicesManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MisMtchRjctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#RejectionIdentification
 * MisMatchRejectionV02.RejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#TransactionIdentification
 * MisMatchRejectionV02.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#SubmitterTransactionReference
 * MisMatchRejectionV02.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#DataSetMatchReportReference
 * MisMatchRejectionV02.DataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#RejectionReason
 * MisMatchRejectionV02.RejectionReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#identifier
 * MisMatchRejectionV02.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MisMatchRejectionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MisMatchRejection message is sent by the party requested to accept or reject data set mis-matches to the matching application.\r\nThis message is used to reject mis-matches between data sets and the related baseline.\r\nUsage\r\nThe MisMatchRejection message can be sent by the party requested to accept or reject data set mis-match to inform that it rejects the data set(s).\r\nThe message can be sent in response to a DataSetMatchReport message conveying mis-matches.\r\nThe information about the rejection of the mis-matched data sets will be forwarded by the matching application to the submitter of the data sets by a MisMatchRejectionNotification message.\r\nThe acceptance of mis-matched data sets can be achieved by sending a MisMatchAcceptance message."
 * </li>
 * </ul>
 */
public class MisMatchRejectionV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the rejection message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the rejection message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock RejectionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RjctnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionIdentification";
			definition = "Identifies the rejection message.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	/**
	 * Unique identification assigned by the matching application to the
	 * transaction. This identification is to be used in any communication
	 * between the parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock TransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}
	};
	/**
	 * Reference to the transaction for the requesting financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for the requesting financial institution."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock SubmitterTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmitrTxRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the transaction for the requesting financial institution.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}
	};
	/**
	 * Reference to the identification of the report that contained the
	 * difference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetMtchRptRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetMatchReportReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of the report that contained the difference. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock DataSetMatchReportReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "DataSetMtchRptRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetMatchReportReference";
			definition = "Reference to the identification of the report that contained the difference. ";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	/**
	 * Reason why the user cannot accept the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason1Choice
	 * RejectionReason1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the user cannot accept the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock RejectionReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "RjctnRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Reason why the user cannot accept the request.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> RejectionReason1Choice.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "tsmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "022"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "tsmt";
			messageFunctionality = "022";
			version = "02";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MisMatchRejectionV02";
				definition = "Scope\r\nThe MisMatchRejection message is sent by the party requested to accept or reject data set mis-matches to the matching application.\r\nThis message is used to reject mis-matches between data sets and the related baseline.\r\nUsage\r\nThe MisMatchRejection message can be sent by the party requested to accept or reject data set mis-match to inform that it rejects the data set(s).\r\nThe message can be sent in response to a DataSetMatchReport message conveying mis-matches.\r\nThe information about the rejection of the mis-matched data sets will be forwarded by the matching application to the submitter of the data sets by a MisMatchRejectionNotification message.\r\nThe acceptance of mis-matched data sets can be achieved by sending a MisMatchAcceptance message.";
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "MisMtchRjctn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.MisMatchRejectionV02.RejectionIdentification, com.tools20022.repository.area.tsmt.MisMatchRejectionV02.TransactionIdentification,
						com.tools20022.repository.area.tsmt.MisMatchRejectionV02.SubmitterTransactionReference, com.tools20022.repository.area.tsmt.MisMatchRejectionV02.DataSetMatchReportReference,
						com.tools20022.repository.area.tsmt.MisMatchRejectionV02.RejectionReason);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.tsmt.MisMatchRejectionV02.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}