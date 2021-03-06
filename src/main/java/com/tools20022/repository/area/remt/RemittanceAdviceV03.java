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

package com.tools20022.repository.area.remt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsRemittanceAdviceLatestVersion;
import com.tools20022.repository.msg.GroupHeader62;
import com.tools20022.repository.msg.RemittanceInformation13;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017;
import com.tools20022.repository.msgset.StandAloneRemittanceAdviceISOLatestversion;
import com.tools20022.repository.msgset.StandAloneRemittanceAdviceMaintenance20162017;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The RemittanceAdvice message allows the originator to provide remittance
 * details that can be associated with a payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code remt.001.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsRemittanceAdviceLatestVersion
 * PaymentsRemittanceAdviceLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV03#mmGroupHeader
 * RemittanceAdviceV03.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV03#mmRemittanceInformation
 * RemittanceAdviceV03.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV03#mmSupplementaryData
 * RemittanceAdviceV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.StandAloneRemittanceAdviceISOLatestversion
 * StandAloneRemittanceAdviceISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017
 * MX_Payment_Maintenance_2016_2017}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.StandAloneRemittanceAdviceMaintenance20162017
 * StandAloneRemittanceAdviceMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RmtAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RemittanceAdviceV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The RemittanceAdvice message allows the originator to provide remittance details that can be associated with a payment."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV02
 * RemittanceAdviceV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RemittanceAdviceV03", propOrder = {"groupHeader", "remittanceInformation", "supplementaryData"})
public class RemittanceAdviceV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader62 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader62
	 * GroupHeader62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all remittance information included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV02#mmGroupHeader
	 * RemittanceAdviceV02.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RemittanceAdviceV03, GroupHeader62> mmGroupHeader = new MMMessageBuildingBlock<RemittanceAdviceV03, GroupHeader62>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all remittance information included in the message.";
			previousVersion_lazy = () -> RemittanceAdviceV02.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader62.mmObject();
		}

		@Override
		public GroupHeader62 getValue(RemittanceAdviceV03 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(RemittanceAdviceV03 obj, GroupHeader62 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "RmtInf", required = true)
	protected List<RemittanceInformation13> remittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13
	 * RemittanceInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information to enable the matching of an entry with the items that the associated payment is intended to settle, such as commercial invoices in an accounts' receivable system, tax obligations, or garnishment orders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV02#mmRemittanceInformation
	 * RemittanceAdviceV02.mmRemittanceInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RemittanceAdviceV03, List<RemittanceInformation13>> mmRemittanceInformation = new MMMessageBuildingBlock<RemittanceAdviceV03, List<RemittanceInformation13>>() {
		{
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Provides information to enable the matching of an entry with the items that the associated payment is intended to settle, such as commercial invoices in an accounts' receivable system, tax obligations, or garnishment orders.";
			previousVersion_lazy = () -> RemittanceAdviceV02.mmRemittanceInformation;
			minOccurs = 1;
			complexType_lazy = () -> RemittanceInformation13.mmObject();
		}

		@Override
		public List<RemittanceInformation13> getValue(RemittanceAdviceV03 obj) {
			return obj.getRemittanceInformation();
		}

		@Override
		public void setValue(RemittanceAdviceV03 obj, List<RemittanceInformation13> value) {
			obj.setRemittanceInformation(value);
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
	 * {@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV02#mmSupplementaryData
	 * RemittanceAdviceV02.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RemittanceAdviceV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<RemittanceAdviceV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> RemittanceAdviceV02.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(RemittanceAdviceV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(RemittanceAdviceV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceAdviceV03";
				definition = "The RemittanceAdvice message allows the originator to provide remittance details that can be associated with a payment.";
				previousVersion_lazy = () -> RemittanceAdviceV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(StandAloneRemittanceAdviceISOLatestversion.mmObject(), MX_Payment_Maintenance_2016_2017.mmObject(), StandAloneRemittanceAdviceMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "RmtAdvc";
				businessArea_lazy = () -> PaymentsRemittanceAdviceLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.remt.RemittanceAdviceV03.mmGroupHeader, com.tools20022.repository.area.remt.RemittanceAdviceV03.mmRemittanceInformation,
						com.tools20022.repository.area.remt.RemittanceAdviceV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "remt";
						messageFunctionality = "001";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RemittanceAdviceV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader62 getGroupHeader() {
		return groupHeader;
	}

	public RemittanceAdviceV03 setGroupHeader(GroupHeader62 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<RemittanceInformation13> getRemittanceInformation() {
		return remittanceInformation == null ? remittanceInformation = new ArrayList<>() : remittanceInformation;
	}

	public RemittanceAdviceV03 setRemittanceInformation(List<RemittanceInformation13> remittanceInformation) {
		this.remittanceInformation = Objects.requireNonNull(remittanceInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public RemittanceAdviceV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:remt.001.001.03")
	static public class Document {
		@XmlElement(name = "RmtAdvc", required = true)
		public RemittanceAdviceV03 messageBody;
	}
}