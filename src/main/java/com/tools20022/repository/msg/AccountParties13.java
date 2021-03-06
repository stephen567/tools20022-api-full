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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV06;
import com.tools20022.repository.choice.AccountParties8Choice;
import com.tools20022.repository.choice.RegisteredShareholderName1Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExtendedParty9;
import com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a party's account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmPrincipalAccountParty
 * AccountParties13.mmPrincipalAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmSecondaryOwner
 * AccountParties13.mmSecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#mmBeneficiary
 * AccountParties13.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmPowerOfAttorney
 * AccountParties13.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmLegalGuardian
 * AccountParties13.mmLegalGuardian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmCustodianForMinor
 * AccountParties13.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmSuccessorOnDeath
 * AccountParties13.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmAdministrator
 * AccountParties13.mmAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#mmOtherParty
 * AccountParties13.mmOtherParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#mmGranter
 * AccountParties13.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#mmSettlor
 * AccountParties13.mmSettlor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmRegisteredShareholderName
 * AccountParties13.mmRegisteredShareholderName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmAccountParties
 * AccountOpeningInstructionV06.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmAccountParties
 * AccountDetailsConfirmationV06.mmAccountParties}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountParties13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a party's account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties13
 * ConstraintBeneficiaryRule.forAccountParties13}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15
 * AccountParties15}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountParties10 AccountParties10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountParties13", propOrder = {"principalAccountParty", "secondaryOwner", "beneficiary", "powerOfAttorney", "legalGuardian", "custodianForMinor", "successorOnDeath", "administrator", "otherParty", "granter", "settlor",
		"registeredShareholderName"})
public class AccountParties13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrncplAcctPty", required = true)
	protected AccountParties8Choice principalAccountParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice
	 * AccountParties8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrncplAcctPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAccountParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Main party associated with the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmPrincipalAccountParty
	 * AccountParties15.mmPrincipalAccountParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmPrincipalAccountParty
	 * AccountParties10.mmPrincipalAccountParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountParties13, AccountParties8Choice> mmPrincipalAccountParty = new MMMessageAttribute<AccountParties13, AccountParties8Choice>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "PrncplAcctPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAccountParty";
			definition = "Main party associated with the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmPrincipalAccountParty);
			previousVersion_lazy = () -> AccountParties10.mmPrincipalAccountParty;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountParties8Choice.mmObject();
		}

		@Override
		public AccountParties8Choice getValue(AccountParties13 obj) {
			return obj.getPrincipalAccountParty();
		}

		@Override
		public void setValue(AccountParties13 obj, AccountParties8Choice value) {
			obj.setPrincipalAccountParty(value);
		}
	};
	@XmlElement(name = "ScndryOwnr")
	protected List<InvestmentAccountOwnershipInformation12> secondaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecondaryOwner
	 * SecondaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that is not the primary owner when the ownership of the investment account is split among several owners."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmSecondaryOwner
	 * AccountParties15.mmSecondaryOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmSecondaryOwner
	 * AccountParties10.mmSecondaryOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>> mmSecondaryOwner = new MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>>() {
		{
			businessComponentTrace_lazy = () -> SecondaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "ScndryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOwner";
			definition = "Entity that is not the primary owner when the ownership of the investment account is split among several owners.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmSecondaryOwner);
			previousVersion_lazy = () -> AccountParties10.mmSecondaryOwner;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation12> getValue(AccountParties13 obj) {
			return obj.getSecondaryOwner();
		}

		@Override
		public void setValue(AccountParties13 obj, List<InvestmentAccountOwnershipInformation12> value) {
			obj.setSecondaryOwner(value);
		}
	};
	@XmlElement(name = "Bnfcry")
	protected List<InvestmentAccountOwnershipInformation12> beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bnfcry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmBeneficiary
	 * AccountParties15.mmBeneficiary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmBeneficiary
	 * AccountParties10.mmBeneficiary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>> mmBeneficiary = new MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>>() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmBeneficiary);
			previousVersion_lazy = () -> AccountParties10.mmBeneficiary;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation12> getValue(AccountParties13 obj) {
			return obj.getBeneficiary();
		}

		@Override
		public void setValue(AccountParties13 obj, List<InvestmentAccountOwnershipInformation12> value) {
			obj.setBeneficiary(value);
		}
	};
	@XmlElement(name = "PwrOfAttny")
	protected List<InvestmentAccountOwnershipInformation12> powerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateHolder MandateHolder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PwrOfAttny"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that was given the authority by another entity to act on its behalf."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmPowerOfAttorney
	 * AccountParties15.mmPowerOfAttorney}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmPowerOfAttorney
	 * AccountParties10.mmPowerOfAttorney}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>> mmPowerOfAttorney = new MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>>() {
		{
			businessComponentTrace_lazy = () -> MandateHolder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorney";
			definition = "Entity that was given the authority by another entity to act on its behalf.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmPowerOfAttorney);
			previousVersion_lazy = () -> AccountParties10.mmPowerOfAttorney;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation12> getValue(AccountParties13 obj) {
			return obj.getPowerOfAttorney();
		}

		@Override
		public void setValue(AccountParties13 obj, List<InvestmentAccountOwnershipInformation12> value) {
			obj.setPowerOfAttorney(value);
		}
	};
	@XmlElement(name = "LglGuardn")
	protected List<InvestmentAccountOwnershipInformation12> legalGuardian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.LegalGuardianRole
	 * LegalGuardianRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglGuardn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalGuardian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmLegalGuardian
	 * AccountParties15.mmLegalGuardian}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmLegalGuardian
	 * AccountParties10.mmLegalGuardian}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>> mmLegalGuardian = new MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>>() {
		{
			businessComponentTrace_lazy = () -> LegalGuardianRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "LglGuardn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalGuardian";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmLegalGuardian);
			previousVersion_lazy = () -> AccountParties10.mmLegalGuardian;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation12> getValue(AccountParties13 obj) {
			return obj.getLegalGuardian();
		}

		@Override
		public void setValue(AccountParties13 obj, List<InvestmentAccountOwnershipInformation12> value) {
			obj.setLegalGuardian(value);
		}
	};
	@XmlElement(name = "CtdnForMnr")
	protected InvestmentAccountOwnershipInformation12 custodianForMinor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CustodianForMinor
	 * CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnForMnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianForMinor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmCustodianForMinor
	 * AccountParties15.mmCustodianForMinor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, Optional<InvestmentAccountOwnershipInformation12>> mmCustodianForMinor = new MMMessageAssociationEnd<AccountParties13, Optional<InvestmentAccountOwnershipInformation12>>() {
		{
			businessComponentTrace_lazy = () -> CustodianForMinor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "CtdnForMnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmCustodianForMinor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation12> getValue(AccountParties13 obj) {
			return obj.getCustodianForMinor();
		}

		@Override
		public void setValue(AccountParties13 obj, Optional<InvestmentAccountOwnershipInformation12> value) {
			obj.setCustodianForMinor(value.orElse(null));
		}
	};
	@XmlElement(name = "SucssrOnDth")
	protected List<InvestmentAccountOwnershipInformation12> successorOnDeath;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuccessorOnDeath
	 * SuccessorOnDeath}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SucssrOnDth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuccessorOnDeath"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmSuccessorOnDeath
	 * AccountParties15.mmSuccessorOnDeath}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmSuccessorOnDeath
	 * AccountParties10.mmSuccessorOnDeath}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>> mmSuccessorOnDeath = new MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>>() {
		{
			businessComponentTrace_lazy = () -> SuccessorOnDeath.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "SucssrOnDth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuccessorOnDeath";
			definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmSuccessorOnDeath);
			previousVersion_lazy = () -> AccountParties10.mmSuccessorOnDeath;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation12> getValue(AccountParties13 obj) {
			return obj.getSuccessorOnDeath();
		}

		@Override
		public void setValue(AccountParties13 obj, List<InvestmentAccountOwnershipInformation12> value) {
			obj.setSuccessorOnDeath(value);
		}
	};
	@XmlElement(name = "Admstr")
	protected List<InvestmentAccountOwnershipInformation12> administrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdministratorRole
	 * AdministratorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Admstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Administrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that has been appointed by a legal authority to act on behalf of a person or organisation that has gone bankrupt."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmAdministrator
	 * AccountParties15.mmAdministrator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmAdministrator
	 * AccountParties10.mmAdministrator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>> mmAdministrator = new MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>>() {
		{
			businessComponentTrace_lazy = () -> AdministratorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "Admstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person or organisation that has gone bankrupt.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmAdministrator);
			previousVersion_lazy = () -> AccountParties10.mmAdministrator;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation12> getValue(AccountParties13 obj) {
			return obj.getAdministrator();
		}

		@Override
		public void setValue(AccountParties13 obj, List<InvestmentAccountOwnershipInformation12> value) {
			obj.setAdministrator(value);
		}
	};
	@XmlElement(name = "OthrPty")
	protected List<ExtendedParty9> otherParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExtendedParty9
	 * ExtendedParty9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other type of party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmOtherParty
	 * AccountParties15.mmOtherParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmOtherParty
	 * AccountParties10.mmOtherParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, List<ExtendedParty9>> mmOtherParty = new MMMessageAssociationEnd<AccountParties13, List<ExtendedParty9>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "Other type of party.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmOtherParty);
			previousVersion_lazy = () -> AccountParties10.mmOtherParty;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExtendedParty9.mmObject();
		}

		@Override
		public List<ExtendedParty9> getValue(AccountParties13 obj) {
			return obj.getOtherParty();
		}

		@Override
		public void setValue(AccountParties13 obj, List<ExtendedParty9> value) {
			obj.setOtherParty(value);
		}
	};
	@XmlElement(name = "Grntr")
	protected List<InvestmentAccountOwnershipInformation12> granter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Grantor Grantor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Granter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Granter role in the hedge funds industry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmGranter
	 * AccountParties15.mmGranter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmGranter
	 * AccountParties10.mmGranter}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>> mmGranter = new MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>>() {
		{
			businessComponentTrace_lazy = () -> Grantor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "Grntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Granter";
			definition = "Granter role in the hedge funds industry.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmGranter);
			previousVersion_lazy = () -> AccountParties10.mmGranter;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation12> getValue(AccountParties13 obj) {
			return obj.getGranter();
		}

		@Override
		public void setValue(AccountParties13 obj, List<InvestmentAccountOwnershipInformation12> value) {
			obj.setGranter(value);
		}
	};
	@XmlElement(name = "Sttlr")
	protected List<InvestmentAccountOwnershipInformation12> settlor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlor Settlor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that creates a trust or contributes assets to the trust."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmSettlor
	 * AccountParties15.mmSettlor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmSettlor
	 * AccountParties10.mmSettlor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>> mmSettlor = new MMMessageAssociationEnd<AccountParties13, List<InvestmentAccountOwnershipInformation12>>() {
		{
			businessComponentTrace_lazy = () -> Settlor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "Sttlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlor";
			definition = "Entity that creates a trust or contributes assets to the trust.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmSettlor);
			previousVersion_lazy = () -> AccountParties10.mmSettlor;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation12> getValue(AccountParties13 obj) {
			return obj.getSettlor();
		}

		@Override
		public void setValue(AccountParties13 obj, List<InvestmentAccountOwnershipInformation12> value) {
			obj.setSettlor(value);
		}
	};
	@XmlElement(name = "RegdShrhldrNm")
	protected RegisteredShareholderName1Choice registeredShareholderName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RegisteredShareholderName1Choice
	 * RegisteredShareholderName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdShrhldrNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredShareholderName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that registers its name with the issuer and the name used for the registration."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmRegisteredShareholderName
	 * AccountParties15.mmRegisteredShareholderName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties13, Optional<RegisteredShareholderName1Choice>> mmRegisteredShareholderName = new MMMessageAssociationEnd<AccountParties13, Optional<RegisteredShareholderName1Choice>>() {
		{
			businessComponentTrace_lazy = () -> RolePlayer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties13.mmObject();
			isDerived = false;
			xmlTag = "RegdShrhldrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredShareholderName";
			definition = "Party that registers its name with the issuer and the name used for the registration.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmRegisteredShareholderName);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RegisteredShareholderName1Choice.mmObject();
		}

		@Override
		public Optional<RegisteredShareholderName1Choice> getValue(AccountParties13 obj) {
			return obj.getRegisteredShareholderName();
		}

		@Override
		public void setValue(AccountParties13 obj, Optional<RegisteredShareholderName1Choice> value) {
			obj.setRegisteredShareholderName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties13.mmPrincipalAccountParty, com.tools20022.repository.msg.AccountParties13.mmSecondaryOwner,
						com.tools20022.repository.msg.AccountParties13.mmBeneficiary, com.tools20022.repository.msg.AccountParties13.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties13.mmLegalGuardian,
						com.tools20022.repository.msg.AccountParties13.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties13.mmSuccessorOnDeath, com.tools20022.repository.msg.AccountParties13.mmAdministrator,
						com.tools20022.repository.msg.AccountParties13.mmOtherParty, com.tools20022.repository.msg.AccountParties13.mmGranter, com.tools20022.repository.msg.AccountParties13.mmSettlor,
						com.tools20022.repository.msg.AccountParties13.mmRegisteredShareholderName);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountOpeningInstructionV06.mmAccountParties, AccountDetailsConfirmationV06.mmAccountParties);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties13);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountParties13";
				definition = "Information about a party's account.";
				nextVersions_lazy = () -> Arrays.asList(AccountParties15.mmObject());
				previousVersion_lazy = () -> AccountParties10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AccountParties8Choice getPrincipalAccountParty() {
		return principalAccountParty;
	}

	public AccountParties13 setPrincipalAccountParty(AccountParties8Choice principalAccountParty) {
		this.principalAccountParty = Objects.requireNonNull(principalAccountParty);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation12> getSecondaryOwner() {
		return secondaryOwner == null ? secondaryOwner = new ArrayList<>() : secondaryOwner;
	}

	public AccountParties13 setSecondaryOwner(List<InvestmentAccountOwnershipInformation12> secondaryOwner) {
		this.secondaryOwner = Objects.requireNonNull(secondaryOwner);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation12> getBeneficiary() {
		return beneficiary == null ? beneficiary = new ArrayList<>() : beneficiary;
	}

	public AccountParties13 setBeneficiary(List<InvestmentAccountOwnershipInformation12> beneficiary) {
		this.beneficiary = Objects.requireNonNull(beneficiary);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation12> getPowerOfAttorney() {
		return powerOfAttorney == null ? powerOfAttorney = new ArrayList<>() : powerOfAttorney;
	}

	public AccountParties13 setPowerOfAttorney(List<InvestmentAccountOwnershipInformation12> powerOfAttorney) {
		this.powerOfAttorney = Objects.requireNonNull(powerOfAttorney);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation12> getLegalGuardian() {
		return legalGuardian == null ? legalGuardian = new ArrayList<>() : legalGuardian;
	}

	public AccountParties13 setLegalGuardian(List<InvestmentAccountOwnershipInformation12> legalGuardian) {
		this.legalGuardian = Objects.requireNonNull(legalGuardian);
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation12> getCustodianForMinor() {
		return custodianForMinor == null ? Optional.empty() : Optional.of(custodianForMinor);
	}

	public AccountParties13 setCustodianForMinor(InvestmentAccountOwnershipInformation12 custodianForMinor) {
		this.custodianForMinor = custodianForMinor;
		return this;
	}

	public List<InvestmentAccountOwnershipInformation12> getSuccessorOnDeath() {
		return successorOnDeath == null ? successorOnDeath = new ArrayList<>() : successorOnDeath;
	}

	public AccountParties13 setSuccessorOnDeath(List<InvestmentAccountOwnershipInformation12> successorOnDeath) {
		this.successorOnDeath = Objects.requireNonNull(successorOnDeath);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation12> getAdministrator() {
		return administrator == null ? administrator = new ArrayList<>() : administrator;
	}

	public AccountParties13 setAdministrator(List<InvestmentAccountOwnershipInformation12> administrator) {
		this.administrator = Objects.requireNonNull(administrator);
		return this;
	}

	public List<ExtendedParty9> getOtherParty() {
		return otherParty == null ? otherParty = new ArrayList<>() : otherParty;
	}

	public AccountParties13 setOtherParty(List<ExtendedParty9> otherParty) {
		this.otherParty = Objects.requireNonNull(otherParty);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation12> getGranter() {
		return granter == null ? granter = new ArrayList<>() : granter;
	}

	public AccountParties13 setGranter(List<InvestmentAccountOwnershipInformation12> granter) {
		this.granter = Objects.requireNonNull(granter);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation12> getSettlor() {
		return settlor == null ? settlor = new ArrayList<>() : settlor;
	}

	public AccountParties13 setSettlor(List<InvestmentAccountOwnershipInformation12> settlor) {
		this.settlor = Objects.requireNonNull(settlor);
		return this;
	}

	public Optional<RegisteredShareholderName1Choice> getRegisteredShareholderName() {
		return registeredShareholderName == null ? Optional.empty() : Optional.of(registeredShareholderName);
	}

	public AccountParties13 setRegisteredShareholderName(RegisteredShareholderName1Choice registeredShareholderName) {
		this.registeredShareholderName = registeredShareholderName;
		return this;
	}
}