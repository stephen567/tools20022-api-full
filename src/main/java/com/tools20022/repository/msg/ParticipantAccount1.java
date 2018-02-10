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
import com.tools20022.repository.choice.LiquidityPoolMembers1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details from participant profile account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmAccountTypeName
 * ParticipantAccount1.mmAccountTypeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmAccountTypeShortName
 * ParticipantAccount1.mmAccountTypeShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmOpeningDate
 * ParticipantAccount1.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmClosingDate
 * ParticipantAccount1.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmDeletionDate
 * ParticipantAccount1.mmDeletionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmLicenseWithdrawalDocument
 * ParticipantAccount1.mmLicenseWithdrawalDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmAccountRestrictions
 * ParticipantAccount1.mmAccountRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmDesignatedAccount
 * ParticipantAccount1.mmDesignatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmLiquidityPoolParticipantDetails
 * ParticipantAccount1.mmLiquidityPoolParticipantDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmLimits
 * ParticipantAccount1.mmLimits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmArrests
 * ParticipantAccount1.mmArrests}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmMigration
 * ParticipantAccount1.mmMigration}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ParticipantAccount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details from participant profile account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ParticipantAccount1", propOrder = {"accountTypeName", "accountTypeShortName", "openingDate", "closingDate", "deletionDate", "licenseWithdrawalDocument", "accountRestrictions", "designatedAccount",
		"liquidityPoolParticipantDetails", "limits", "arrests", "migration"})
public class ParticipantAccount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctTpNm", required = true)
	protected Max40Text accountTypeName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTpNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTypeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the account"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountTypeName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "AcctTpNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTypeName";
			definition = "Type of the account";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
	@XmlElement(name = "AcctTpShrtNm", required = true)
	protected Max140Text accountTypeShortName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTpShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTypeShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short name for the account type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountTypeShortName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "AcctTpShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTypeShortName";
			definition = "Short name for the account type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "OpngDt", required = true)
	protected ISODateTime openingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the account was open."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Date the account was open.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "ClsgDt")
	protected ISODateTime closingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the account was closed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Date the account was closed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "DeltnDt")
	protected ISODateTime deletionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeletionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the information about the account was deleted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeletionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "DeltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeletionDate";
			definition = "Date the information about the account was deleted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "LicWdrwlDoc")
	protected DocumentIdentification11 licenseWithdrawalDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11
	 * DocumentIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LicWdrwlDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LicenseWithdrawalDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to license withdrawal."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLicenseWithdrawalDocument = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "LicWdrwlDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LicenseWithdrawalDocument";
			definition = "Details related to license withdrawal.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification11.mmObject();
		}
	};
	@XmlElement(name = "AcctRstrctns")
	protected List<com.tools20022.repository.msg.AccountRestrictions1> accountRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctRstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details regarding intraday account restrictions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountRestrictions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "AcctRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountRestrictions";
			definition = "Details regarding intraday account restrictions.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountRestrictions1.mmObject();
		}
	};
	@XmlElement(name = "DsgntdAcct")
	protected DefaultAccountDetails1 designatedAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DefaultAccountDetails1
	 * DefaultAccountDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DsgntdAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance sweeping account used for automated funds transfer when the receiver account is not available."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDesignatedAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "DsgntdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignatedAccount";
			definition = "Balance sweeping account used for automated funds transfer when the receiver account is not available.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DefaultAccountDetails1.mmObject();
		}
	};
	@XmlElement(name = "LqdtyPoolPtcptDtls")
	protected LiquidityPoolMembers1Choice liquidityPoolParticipantDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LiquidityPoolMembers1Choice
	 * LiquidityPoolMembers1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyPoolPtcptDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityPoolParticipantDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about account and account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLiquidityPoolParticipantDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "LqdtyPoolPtcptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityPoolParticipantDetails";
			definition = "Information about account and account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LiquidityPoolMembers1Choice.mmObject();
		}
	};
	@XmlElement(name = "Lmts")
	protected List<com.tools20022.repository.msg.AccountLimits1> limits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountLimits1
	 * AccountLimits1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Values and types of limits set on the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimits = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "Lmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limits";
			definition = "Values and types of limits set on the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountLimits1.mmObject();
		}
	};
	@XmlElement(name = "Arrsts")
	protected List<com.tools20022.repository.msg.ArrestedFunds1> arrests;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ArrestedFunds1
	 * ArrestedFunds1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Arrsts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Arrests"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the arrest."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmArrests = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "Arrsts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Arrests";
			definition = "Information related to the arrest.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ArrestedFunds1.mmObject();
		}
	};
	@XmlElement(name = "Mgrtn")
	protected SystemMigration1 migration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemMigration1
	 * SystemMigration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mgrtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Migration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related for participant migration process. "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMigration = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "Mgrtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Migration";
			definition = "Information related for participant migration process. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemMigration1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ParticipantAccount1.mmAccountTypeName, com.tools20022.repository.msg.ParticipantAccount1.mmAccountTypeShortName,
						com.tools20022.repository.msg.ParticipantAccount1.mmOpeningDate, com.tools20022.repository.msg.ParticipantAccount1.mmClosingDate, com.tools20022.repository.msg.ParticipantAccount1.mmDeletionDate,
						com.tools20022.repository.msg.ParticipantAccount1.mmLicenseWithdrawalDocument, com.tools20022.repository.msg.ParticipantAccount1.mmAccountRestrictions,
						com.tools20022.repository.msg.ParticipantAccount1.mmDesignatedAccount, com.tools20022.repository.msg.ParticipantAccount1.mmLiquidityPoolParticipantDetails, com.tools20022.repository.msg.ParticipantAccount1.mmLimits,
						com.tools20022.repository.msg.ParticipantAccount1.mmArrests, com.tools20022.repository.msg.ParticipantAccount1.mmMigration);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ParticipantAccount1";
				definition = "Details from participant profile account.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max40Text getAccountTypeName() {
		return accountTypeName;
	}

	public ParticipantAccount1 setAccountTypeName(Max40Text accountTypeName) {
		this.accountTypeName = Objects.requireNonNull(accountTypeName);
		return this;
	}

	public Max140Text getAccountTypeShortName() {
		return accountTypeShortName;
	}

	public ParticipantAccount1 setAccountTypeShortName(Max140Text accountTypeShortName) {
		this.accountTypeShortName = Objects.requireNonNull(accountTypeShortName);
		return this;
	}

	public ISODateTime getOpeningDate() {
		return openingDate;
	}

	public ParticipantAccount1 setOpeningDate(ISODateTime openingDate) {
		this.openingDate = Objects.requireNonNull(openingDate);
		return this;
	}

	public Optional<ISODateTime> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public ParticipantAccount1 setClosingDate(ISODateTime closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public Optional<ISODateTime> getDeletionDate() {
		return deletionDate == null ? Optional.empty() : Optional.of(deletionDate);
	}

	public ParticipantAccount1 setDeletionDate(ISODateTime deletionDate) {
		this.deletionDate = deletionDate;
		return this;
	}

	public Optional<DocumentIdentification11> getLicenseWithdrawalDocument() {
		return licenseWithdrawalDocument == null ? Optional.empty() : Optional.of(licenseWithdrawalDocument);
	}

	public ParticipantAccount1 setLicenseWithdrawalDocument(com.tools20022.repository.msg.DocumentIdentification11 licenseWithdrawalDocument) {
		this.licenseWithdrawalDocument = licenseWithdrawalDocument;
		return this;
	}

	public List<AccountRestrictions1> getAccountRestrictions() {
		return accountRestrictions == null ? accountRestrictions = new ArrayList<>() : accountRestrictions;
	}

	public ParticipantAccount1 setAccountRestrictions(List<com.tools20022.repository.msg.AccountRestrictions1> accountRestrictions) {
		this.accountRestrictions = Objects.requireNonNull(accountRestrictions);
		return this;
	}

	public Optional<DefaultAccountDetails1> getDesignatedAccount() {
		return designatedAccount == null ? Optional.empty() : Optional.of(designatedAccount);
	}

	public ParticipantAccount1 setDesignatedAccount(com.tools20022.repository.msg.DefaultAccountDetails1 designatedAccount) {
		this.designatedAccount = designatedAccount;
		return this;
	}

	public Optional<LiquidityPoolMembers1Choice> getLiquidityPoolParticipantDetails() {
		return liquidityPoolParticipantDetails == null ? Optional.empty() : Optional.of(liquidityPoolParticipantDetails);
	}

	public ParticipantAccount1 setLiquidityPoolParticipantDetails(LiquidityPoolMembers1Choice liquidityPoolParticipantDetails) {
		this.liquidityPoolParticipantDetails = liquidityPoolParticipantDetails;
		return this;
	}

	public List<AccountLimits1> getLimits() {
		return limits == null ? limits = new ArrayList<>() : limits;
	}

	public ParticipantAccount1 setLimits(List<com.tools20022.repository.msg.AccountLimits1> limits) {
		this.limits = Objects.requireNonNull(limits);
		return this;
	}

	public List<ArrestedFunds1> getArrests() {
		return arrests == null ? arrests = new ArrayList<>() : arrests;
	}

	public ParticipantAccount1 setArrests(List<com.tools20022.repository.msg.ArrestedFunds1> arrests) {
		this.arrests = Objects.requireNonNull(arrests);
		return this;
	}

	public Optional<SystemMigration1> getMigration() {
		return migration == null ? Optional.empty() : Optional.of(migration);
	}

	public ParticipantAccount1 setMigration(com.tools20022.repository.msg.SystemMigration1 migration) {
		this.migration = migration;
		return this;
	}
}