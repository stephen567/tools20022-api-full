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
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.msg.AccountStatement6;
import com.tools20022.repository.msg.GroupHeader58;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.BanktoCustomerCashManagementISOPreviousversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The BankToCustomerStatement message is sent by the account servicer to an
 * account owner or to a party authorised by the account owner to receive the
 * message. It is used to inform the account owner, or authorised party, of the
 * entries booked to the account, and to provide the owner with balance
 * information on the account at a given point in time.<br>
 * <b>Usage</b><br>
 * The BankToCustomerStatement message can contain reports for more than one
 * account. It provides information for cash management and/or reconciliation.<br>
 * It contains information on booked entries only.<br>
 * It can include underlying details of transactions that have been included in
 * the entry.<br>
 * The message is exchanged as defined between the account servicer and the
 * account owner. It provides information on items that have been booked to the
 * account and also balance information. Depending on services and schedule
 * agreed between banks and their customers, statements may be generated and
 * exchanged accordingly, for example for intraday or prior day periods.<br>
 * It is possible that the receiver of the message is not the account owner, but
 * a party entitled through arrangement with the account owner to receive the
 * account information (also known as recipient).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.053.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV06#mmGroupHeader
 * BankToCustomerStatementV06.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV06#mmStatement
 * BankToCustomerStatementV06.mmStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV06#mmSupplementaryData
 * BankToCustomerStatementV06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.BanktoCustomerCashManagementISOPreviousversion
 * BanktoCustomerCashManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BkToCstmrStmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankToCustomerStatementV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BankToCustomerStatement message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It is used to inform the account owner, or authorised party, of the entries booked to the account, and to provide the owner with balance information on the account at a given point in time.\r\nUsage\r\nThe BankToCustomerStatement message can contain reports for more than one account. It provides information for cash management and/or reconciliation.\r\nIt contains information on booked entries only.\r\nIt can include underlying details of transactions that have been included in the entry.\r\nThe message is exchanged as defined between the account servicer and the account owner. It provides information on items that have been booked to the account and also balance information. Depending on services and schedule agreed between banks and their customers, statements may be generated and exchanged accordingly, for example for intraday or prior day periods.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled through arrangement with the account owner to receive the account information (also known as recipient)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrStatementPaginationRule#for_camt_BankToCustomerStatementV06
 * ConstraintMessageOrStatementPaginationRule.
 * for_camt_BankToCustomerStatementV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerStatementV06
 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV06}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07
 * BankToCustomerStatementV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV05
 * BankToCustomerStatementV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BankToCustomerStatementV06", propOrder = {"groupHeader", "statement", "supplementaryData"})
public class BankToCustomerStatementV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader58 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader58
	 * GroupHeader58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common information for the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07#mmGroupHeader
	 * BankToCustomerStatementV07.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV05#mmGroupHeader
	 * BankToCustomerStatementV05.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BankToCustomerStatementV06, GroupHeader58> mmGroupHeader = new MMMessageBuildingBlock<BankToCustomerStatementV06, GroupHeader58>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Common information for the message.";
			nextVersions_lazy = () -> Arrays.asList(BankToCustomerStatementV07.mmGroupHeader);
			previousVersion_lazy = () -> BankToCustomerStatementV05.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader58.mmObject();
		}

		@Override
		public GroupHeader58 getValue(BankToCustomerStatementV06 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(BankToCustomerStatementV06 obj, GroupHeader58 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "Stmt", required = true)
	protected List<AccountStatement6> statement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6
	 * AccountStatement6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Statement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reports on booked entries and balances for a cash account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07#mmStatement
	 * BankToCustomerStatementV07.mmStatement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV05#mmStatement
	 * BankToCustomerStatementV05.mmStatement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BankToCustomerStatementV06, List<AccountStatement6>> mmStatement = new MMMessageBuildingBlock<BankToCustomerStatementV06, List<AccountStatement6>>() {
		{
			xmlTag = "Stmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Statement";
			definition = "Reports on booked entries and balances for a cash account.";
			nextVersions_lazy = () -> Arrays.asList(BankToCustomerStatementV07.mmStatement);
			previousVersion_lazy = () -> BankToCustomerStatementV05.mmStatement;
			minOccurs = 1;
			complexType_lazy = () -> AccountStatement6.mmObject();
		}

		@Override
		public List<AccountStatement6> getValue(BankToCustomerStatementV06 obj) {
			return obj.getStatement();
		}

		@Override
		public void setValue(BankToCustomerStatementV06 obj, List<AccountStatement6> value) {
			obj.setStatement(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07#mmSupplementaryData
	 * BankToCustomerStatementV07.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV05#mmSupplementaryData
	 * BankToCustomerStatementV05.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BankToCustomerStatementV06, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<BankToCustomerStatementV06, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(BankToCustomerStatementV07.mmSupplementaryData);
			previousVersion_lazy = () -> BankToCustomerStatementV05.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(BankToCustomerStatementV06 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(BankToCustomerStatementV06 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrStatementPaginationRule.for_camt_BankToCustomerStatementV06,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankToCustomerStatementV06";
				definition = "Scope\r\nThe BankToCustomerStatement message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It is used to inform the account owner, or authorised party, of the entries booked to the account, and to provide the owner with balance information on the account at a given point in time.\r\nUsage\r\nThe BankToCustomerStatement message can contain reports for more than one account. It provides information for cash management and/or reconciliation.\r\nIt contains information on booked entries only.\r\nIt can include underlying details of transactions that have been included in the entry.\r\nThe message is exchanged as defined between the account servicer and the account owner. It provides information on items that have been booked to the account and also balance information. Depending on services and schedule agreed between banks and their customers, statements may be generated and exchanged accordingly, for example for intraday or prior day periods.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled through arrangement with the account owner to receive the account information (also known as recipient).";
				nextVersions_lazy = () -> Arrays.asList(BankToCustomerStatementV07.mmObject());
				previousVersion_lazy = () -> BankToCustomerStatementV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(BanktoCustomerCashManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "BkToCstmrStmt";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankToCustomerStatementV06.mmGroupHeader, com.tools20022.repository.area.camt.BankToCustomerStatementV06.mmStatement,
						com.tools20022.repository.area.camt.BankToCustomerStatementV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "053";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BankToCustomerStatementV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader58 getGroupHeader() {
		return groupHeader;
	}

	public BankToCustomerStatementV06 setGroupHeader(GroupHeader58 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<AccountStatement6> getStatement() {
		return statement == null ? statement = new ArrayList<>() : statement;
	}

	public BankToCustomerStatementV06 setStatement(List<AccountStatement6> statement) {
		this.statement = Objects.requireNonNull(statement);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public BankToCustomerStatementV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
	static public class Document {
		@XmlElement(name = "BkToCstmrStmt", required = true)
		public BankToCustomerStatementV06 messageBody;
	}
}