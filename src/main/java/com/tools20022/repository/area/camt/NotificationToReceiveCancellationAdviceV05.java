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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.msg.GroupHeader59;
import com.tools20022.repository.msg.OriginalNotification10;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.NotificationtoReceiveISOLatestversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The NotificationToReceiveCancellationAdvice message is sent by an account
 * owner or by a party acting on the account owner's behalf to one of the
 * account owner's account servicing institutions. It is used to advise the
 * account servicing institution about the cancellation of one or more
 * notifications in a previous NotificationToReceive message.<br>
 * <b>Usage</b><br>
 * The NotificationToReceiveCancellationAdvice message is used to advise the
 * account servicing institution that the funds are no longer expected. The
 * message can be used in either a direct or a relay scenario.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.058.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05#mmGroupHeader
 * NotificationToReceiveCancellationAdviceV05.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05#mmOriginalNotification
 * NotificationToReceiveCancellationAdviceV05.mmOriginalNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05#mmSupplementaryData
 * NotificationToReceiveCancellationAdviceV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.NotificationtoReceiveISOLatestversion
 * NotificationtoReceiveISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "NtfctnToRcvCxlAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationToReceiveCancellationAdviceV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe NotificationToReceiveCancellationAdvice message is sent by an account owner or by a party acting on the account owner's behalf to one of the account owner's account servicing institutions. It is used to advise the account servicing institution about the cancellation of one or more notifications in a previous NotificationToReceive message.\r\nUsage\r\nThe NotificationToReceiveCancellationAdvice message is used to advise the account servicing institution that the funds are no longer expected. The message can be used in either a direct or a relay scenario."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV04
 * NotificationToReceiveCancellationAdviceV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NotificationToReceiveCancellationAdviceV05", propOrder = {"groupHeader", "originalNotification", "supplementaryData"})
public class NotificationToReceiveCancellationAdviceV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader59 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader59
	 * GroupHeader59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide further details on the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV04#mmGroupHeader
	 * NotificationToReceiveCancellationAdviceV04.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NotificationToReceiveCancellationAdviceV05, GroupHeader59> mmGroupHeader = new MMMessageBuildingBlock<NotificationToReceiveCancellationAdviceV05, GroupHeader59>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of elements used to provide further details on the message.";
			previousVersion_lazy = () -> NotificationToReceiveCancellationAdviceV04.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader59.mmObject();
		}

		@Override
		public GroupHeader59 getValue(NotificationToReceiveCancellationAdviceV05 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(NotificationToReceiveCancellationAdviceV05 obj, GroupHeader59 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlNtfctn", required = true)
	protected OriginalNotification10 originalNotification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10
	 * OriginalNotification10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNtfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the original notification, to which the cancellation advice refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV04#mmOriginalNotification
	 * NotificationToReceiveCancellationAdviceV04.mmOriginalNotification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NotificationToReceiveCancellationAdviceV05, OriginalNotification10> mmOriginalNotification = new MMMessageBuildingBlock<NotificationToReceiveCancellationAdviceV05, OriginalNotification10>() {
		{
			xmlTag = "OrgnlNtfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNotification";
			definition = "Set of elements used to identify the original notification, to which the cancellation advice refers.";
			previousVersion_lazy = () -> NotificationToReceiveCancellationAdviceV04.mmOriginalNotification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalNotification10.mmObject();
		}

		@Override
		public OriginalNotification10 getValue(NotificationToReceiveCancellationAdviceV05 obj) {
			return obj.getOriginalNotification();
		}

		@Override
		public void setValue(NotificationToReceiveCancellationAdviceV05 obj, OriginalNotification10 value) {
			obj.setOriginalNotification(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV04#mmSupplementaryData
	 * NotificationToReceiveCancellationAdviceV04.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NotificationToReceiveCancellationAdviceV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<NotificationToReceiveCancellationAdviceV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> NotificationToReceiveCancellationAdviceV04.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(NotificationToReceiveCancellationAdviceV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(NotificationToReceiveCancellationAdviceV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationToReceiveCancellationAdviceV05";
				definition = "Scope\r\nThe NotificationToReceiveCancellationAdvice message is sent by an account owner or by a party acting on the account owner's behalf to one of the account owner's account servicing institutions. It is used to advise the account servicing institution about the cancellation of one or more notifications in a previous NotificationToReceive message.\r\nUsage\r\nThe NotificationToReceiveCancellationAdvice message is used to advise the account servicing institution that the funds are no longer expected. The message can be used in either a direct or a relay scenario.";
				previousVersion_lazy = () -> NotificationToReceiveCancellationAdviceV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(NotificationtoReceiveISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "NtfctnToRcvCxlAdvc";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05.mmGroupHeader,
						com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05.mmOriginalNotification, com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "058";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NotificationToReceiveCancellationAdviceV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader59 getGroupHeader() {
		return groupHeader;
	}

	public NotificationToReceiveCancellationAdviceV05 setGroupHeader(GroupHeader59 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalNotification10 getOriginalNotification() {
		return originalNotification;
	}

	public NotificationToReceiveCancellationAdviceV05 setOriginalNotification(OriginalNotification10 originalNotification) {
		this.originalNotification = Objects.requireNonNull(originalNotification);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public NotificationToReceiveCancellationAdviceV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.058.001.05")
	static public class Document {
		@XmlElement(name = "NtfctnToRcvCxlAdvc", required = true)
		public NotificationToReceiveCancellationAdviceV05 messageBody;
	}
}