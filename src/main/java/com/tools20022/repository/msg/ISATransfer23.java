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
import com.tools20022.repository.area.sese.AccountHoldingInformationV05;
import com.tools20022.repository.choice.ISAPortfolio1Choice;
import com.tools20022.repository.codeset.AllOtherCash1Code;
import com.tools20022.repository.codeset.ResidualCash1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the type of product and the assets to be transferred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer23#mmMasterReference
 * ISATransfer23.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer23#mmTransferIdentification
 * ISATransfer23.mmTransferIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer23#mmTransferConfirmationIdentification
 * ISATransfer23.mmTransferConfirmationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer23#mmResidualCash
 * ISATransfer23.mmResidualCash}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer23#mmPortfolio
 * ISATransfer23.mmPortfolio}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer23#mmAllOtherCash
 * ISATransfer23.mmAllOtherCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer23#mmFinancialInstrumentAssetForTransfer
 * ISATransfer23.mmFinancialInstrumentAssetForTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmProductTransfer
 * AccountHoldingInformationV05.mmProductTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISATransfer23"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of product and the assets to be transferred."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ISATransfer14
 * ISATransfer14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISATransfer23", propOrder = {"masterReference", "transferIdentification", "transferConfirmationIdentification", "residualCash", "portfolio", "allOtherCash", "financialInstrumentAssetForTransfer"})
public class ISATransfer23 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer23 ISATransfer23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer14#mmMasterReference
	 * ISATransfer14.mmMasterReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer23.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			previousVersion_lazy = () -> ISATransfer14.mmMasterReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TrfId", required = true)
	protected Max35Text transferIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer23 ISATransfer23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to the transfer of asset, typically assigned by the transferee."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer14#mmTransferIdentification
	 * ISATransfer14.mmTransferIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer23.mmObject();
			isDerived = false;
			xmlTag = "TrfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIdentification";
			definition = "Identification assigned to the transfer of asset, typically assigned by the transferee.";
			previousVersion_lazy = () -> ISATransfer14.mmTransferIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TrfConfId")
	protected Max35Text transferConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer23 ISATransfer23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the confirmation assigned by the transferor to the transfer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer14#mmTransferConfirmationIdentification
	 * ISATransfer14.mmTransferConfirmationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferConfirmationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer23.mmObject();
			isDerived = false;
			xmlTag = "TrfConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationIdentification";
			definition = "Identification of the confirmation assigned by the transferor to the transfer.";
			previousVersion_lazy = () -> ISATransfer14.mmTransferConfirmationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RsdlCsh")
	protected ResidualCash1Code residualCash;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResidualCash1Code
	 * ResidualCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer23 ISATransfer23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsdlCsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidualCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is cash in the account that is awaiting investment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer14#mmResidualCash
	 * ISATransfer14.mmResidualCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResidualCash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer23.mmObject();
			isDerived = false;
			xmlTag = "RsdlCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCash";
			definition = "Indicates whether there is cash in the account that is awaiting investment.";
			previousVersion_lazy = () -> ISATransfer14.mmResidualCash;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResidualCash1Code.mmObject();
		}
	};
	@XmlElement(name = "Prtfl")
	protected ISAPortfolio1Choice portfolio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ISAPortfolio1Choice
	 * ISAPortfolio1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPortfolio
	 * PortfolioTransfer.mmTransferredPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer23 ISATransfer23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies portfolio information or government schemes, for example Individual Savings Account (ISA) in the UK."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer14#mmPortfolio
	 * ISATransfer14.mmPortfolio}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPortfolio = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredPortfolio;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer23.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "Specifies portfolio information or government schemes, for example Individual Savings Account (ISA) in the UK.";
			previousVersion_lazy = () -> ISATransfer14.mmPortfolio;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ISAPortfolio1Choice.mmObject();
		}
	};
	@XmlElement(name = "AllOthrCsh")
	protected AllOtherCash1Code allOtherCash;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllOtherCash1Code
	 * AllOtherCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer23 ISATransfer23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllOthrCsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOtherCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether all remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer14#mmAllOtherCash
	 * ISATransfer14.mmAllOtherCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllOtherCash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer23.mmObject();
			isDerived = false;
			xmlTag = "AllOthrCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOtherCash";
			definition = "Specifies whether all remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash.";
			previousVersion_lazy = () -> ISATransfer14.mmAllOtherCash;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AllOtherCash1Code.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmAsstForTrf")
	protected List<com.tools20022.repository.msg.FinancialInstrument47> financialInstrumentAssetForTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer23 ISATransfer23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAsstForTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAssetForTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying assets for the ISA or portfolio."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer14#mmFinancialInstrumentAssetForTransfer
	 * ISATransfer14.mmFinancialInstrumentAssetForTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAssetForTransfer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer23.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAsstForTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAssetForTransfer";
			definition = "Specifies the underlying assets for the ISA or portfolio.";
			previousVersion_lazy = () -> ISATransfer14.mmFinancialInstrumentAssetForTransfer;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument47.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISATransfer23.mmMasterReference, com.tools20022.repository.msg.ISATransfer23.mmTransferIdentification,
						com.tools20022.repository.msg.ISATransfer23.mmTransferConfirmationIdentification, com.tools20022.repository.msg.ISATransfer23.mmResidualCash, com.tools20022.repository.msg.ISATransfer23.mmPortfolio,
						com.tools20022.repository.msg.ISATransfer23.mmAllOtherCash, com.tools20022.repository.msg.ISATransfer23.mmFinancialInstrumentAssetForTransfer);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountHoldingInformationV05.mmProductTransfer);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISATransfer23";
				definition = "Describes the type of product and the assets to be transferred.";
				previousVersion_lazy = () -> ISATransfer14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public ISATransfer23 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getTransferIdentification() {
		return transferIdentification;
	}

	public ISATransfer23 setTransferIdentification(Max35Text transferIdentification) {
		this.transferIdentification = Objects.requireNonNull(transferIdentification);
		return this;
	}

	public Optional<Max35Text> getTransferConfirmationIdentification() {
		return transferConfirmationIdentification == null ? Optional.empty() : Optional.of(transferConfirmationIdentification);
	}

	public ISATransfer23 setTransferConfirmationIdentification(Max35Text transferConfirmationIdentification) {
		this.transferConfirmationIdentification = transferConfirmationIdentification;
		return this;
	}

	public Optional<ResidualCash1Code> getResidualCash() {
		return residualCash == null ? Optional.empty() : Optional.of(residualCash);
	}

	public ISATransfer23 setResidualCash(ResidualCash1Code residualCash) {
		this.residualCash = residualCash;
		return this;
	}

	public Optional<ISAPortfolio1Choice> getPortfolio() {
		return portfolio == null ? Optional.empty() : Optional.of(portfolio);
	}

	public ISATransfer23 setPortfolio(ISAPortfolio1Choice portfolio) {
		this.portfolio = portfolio;
		return this;
	}

	public Optional<AllOtherCash1Code> getAllOtherCash() {
		return allOtherCash == null ? Optional.empty() : Optional.of(allOtherCash);
	}

	public ISATransfer23 setAllOtherCash(AllOtherCash1Code allOtherCash) {
		this.allOtherCash = allOtherCash;
		return this;
	}

	public List<FinancialInstrument47> getFinancialInstrumentAssetForTransfer() {
		return financialInstrumentAssetForTransfer == null ? financialInstrumentAssetForTransfer = new ArrayList<>() : financialInstrumentAssetForTransfer;
	}

	public ISATransfer23 setFinancialInstrumentAssetForTransfer(List<com.tools20022.repository.msg.FinancialInstrument47> financialInstrumentAssetForTransfer) {
		this.financialInstrumentAssetForTransfer = Objects.requireNonNull(financialInstrumentAssetForTransfer);
		return this;
	}
}