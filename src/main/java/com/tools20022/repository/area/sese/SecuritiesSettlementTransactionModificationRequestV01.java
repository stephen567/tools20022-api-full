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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.UpdateType5Choice;
import com.tools20022.repository.msg.TransactionDetails41;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner sends a SecuritiesSettlementTransactionModificationRequest
 * to an account servicer to request the modification of non core business data
 * (matching or non-matching) information in a pending or settled instruction.
 * It can also be used for the enrichment of an incomplete transaction.<br>
 * The account owner will generally be:<br>
 * - a central securities depository participant which has an account with a
 * central securities depository or a market infrastructure<br>
 * - an investment manager which has an account with a custodian acting as
 * accounting and/or settlement agent.<br>
 * <b>Usage</b><br>
 * The modification must only contain the data to be modified.<br>
 * The message may also be used to:<br>
 * - re-send a message sent by the account owner to the account servicer,<br>
 * - provide a third party with a copy of a message being sent by the account
 * owner for information,<br>
 * - re-send to a third party a copy of a message being sent by the account
 * owner for information.<br>
 * using the relevant elements in the Business Application Header. ISO 15022 -
 * 20022 Coexistence This ISO 20022 message is reversed engineered from ISO
 * 15022. Both standards will coexist for a certain number of years. Until this
 * coexistence period ends, the usage of certain data types is restricted to
 * ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.038.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV01#mmModifiedTransactionDetails
 * SecuritiesSettlementTransactionModificationRequestV01.
 * mmModifiedTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV01#mmUpdateType
 * SecuritiesSettlementTransactionModificationRequestV01.mmUpdateType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxModReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionModificationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner sends a SecuritiesSettlementTransactionModificationRequest to an account servicer to request the modification of non core business data (matching or non-matching) information in a pending or settled instruction. It can also be used for the enrichment of an incomplete transaction.\r\nThe account owner will generally be:\r\n- a central securities depository participant which has an account with a central securities depository or a market infrastructure\r\n- an investment manager which has an account with a custodian acting as accounting and/or settlement agent.\r\nUsage\r\nThe modification must only contain the data to be modified.\r\nThe message may also be used to:\r\n- re-send a message sent by the account owner to the account servicer,\r\n- provide a third party with a copy of a message being sent by the account owner for information,\r\n- re-send to a third party a copy of a message being sent by the account owner for information.\r\nusing the relevant elements in the Business Application Header.\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV01
 * ConstraintPhysicalInstructionDetailsUsageRule.
 * for_sese_SecuritiesSettlementTransactionModificationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV01
 * ConstraintSecuritiesFinancingSettlementUsageRule.
 * for_sese_SecuritiesSettlementTransactionModificationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkagesUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV01
 * ConstraintLinkagesUsageRule.
 * for_sese_SecuritiesSettlementTransactionModificationRequestV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV02
 * SecuritiesSettlementTransactionModificationRequestV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionModificationRequestV01", propOrder = {"modifiedTransactionDetails", "updateType"})
public class SecuritiesSettlementTransactionModificationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ModfdTxDtls", required = true)
	protected TransactionDetails41 modifiedTransactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41
	 * TransactionDetails41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdTxDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the details of the transaction that is being modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestV01, TransactionDetails41> mmModifiedTransactionDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestV01, TransactionDetails41>() {
		{
			xmlTag = "ModfdTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedTransactionDetails";
			definition = "Identifies the details of the transaction that is being modified.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionDetails41.mmObject();
		}

		@Override
		public TransactionDetails41 getValue(SecuritiesSettlementTransactionModificationRequestV01 obj) {
			return obj.getModifiedTransactionDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestV01 obj, TransactionDetails41 value) {
			obj.setModifiedTransactionDetails(value);
		}
	};
	@XmlElement(name = "UpdTp", required = true)
	protected List<UpdateType5Choice> updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType5Choice
	 * UpdateType5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of update requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestV01, List<UpdateType5Choice>> mmUpdateType = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestV01, List<UpdateType5Choice>>() {
		{
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Specifies the type of update requested.";
			maxOccurs = 3;
			minOccurs = 1;
			complexType_lazy = () -> UpdateType5Choice.mmObject();
		}

		@Override
		public List<UpdateType5Choice> getValue(SecuritiesSettlementTransactionModificationRequestV01 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestV01 obj, List<UpdateType5Choice> value) {
			obj.setUpdateType(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV01,
						com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV01,
						com.tools20022.repository.constraints.ConstraintLinkagesUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionModificationRequestV01";
				definition = "Scope\r\nAn account owner sends a SecuritiesSettlementTransactionModificationRequest to an account servicer to request the modification of non core business data (matching or non-matching) information in a pending or settled instruction. It can also be used for the enrichment of an incomplete transaction.\r\nThe account owner will generally be:\r\n- a central securities depository participant which has an account with a central securities depository or a market infrastructure\r\n- an investment manager which has an account with a custodian acting as accounting and/or settlement agent.\r\nUsage\r\nThe modification must only contain the data to be modified.\r\nThe message may also be used to:\r\n- re-send a message sent by the account owner to the account servicer,\r\n- provide a third party with a copy of a message being sent by the account owner for information,\r\n- re-send to a third party a copy of a message being sent by the account owner for information.\r\nusing the relevant elements in the Business Application Header.\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxModReq";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV01.mmModifiedTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV01.mmUpdateType);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "038";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionModificationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionDetails41 getModifiedTransactionDetails() {
		return modifiedTransactionDetails;
	}

	public SecuritiesSettlementTransactionModificationRequestV01 setModifiedTransactionDetails(TransactionDetails41 modifiedTransactionDetails) {
		this.modifiedTransactionDetails = Objects.requireNonNull(modifiedTransactionDetails);
		return this;
	}

	public List<UpdateType5Choice> getUpdateType() {
		return updateType == null ? updateType = new ArrayList<>() : updateType;
	}

	public SecuritiesSettlementTransactionModificationRequestV01 setUpdateType(List<UpdateType5Choice> updateType) {
		this.updateType = Objects.requireNonNull(updateType);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.038.001.01")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxModReq", required = true)
		public SecuritiesSettlementTransactionModificationRequestV01 messageBody;
	}
}