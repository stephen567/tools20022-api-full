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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Chain of parties involved in the settlement of a transaction, including
 * receipts and deliveries, book transfers, treasury deals, or other activities,
 * resulting in the movement of a security or amount of money from one account
 * to another.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#DelivererDetails
 * DeliveringPartiesAndAccount9.DelivererDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#DeliverersCustodianDetails
 * DeliveringPartiesAndAccount9.DeliverersCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#DeliverersIntermediaryDetails
 * DeliveringPartiesAndAccount9.DeliverersIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#DeliveringAgentDetails
 * DeliveringPartiesAndAccount9.DeliveringAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#SecuritiesSettlementSystem
 * DeliveringPartiesAndAccount9.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#PlaceOfSettlementDetails
 * DeliveringPartiesAndAccount9.PlaceOfSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
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
 * "DeliveringPartiesAndAccount9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13
 * DeliveringPartiesAndAccount13}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8
 * DeliveringPartiesAndAccount8}</li>
 * </ul>
 */
public class DeliveringPartiesAndAccount9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party that sells goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount41
	 * InvestmentAccount41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#SettlementAccount
	 * SettlementPartyRole.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelivererDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#DelivererDetails
	 * DeliveringPartiesAndAccount13.DelivererDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#DelivererDetails
	 * DeliveringPartiesAndAccount8.DelivererDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DelivererDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DeliveringPartiesAndAccount9.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.SettlementAccount;
			isDerived = false;
			xmlTag = "DlvrrDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelivererDetails";
			definition = "Party that sells goods or services, or a financial instrument.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount8.DelivererDetails;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount13.DelivererDetails);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccount41.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party that acts on behalf of the seller of securities when the seller
	 * does not have a direct relationship with the delivering agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5
	 * PartyIdentificationAndAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsCtdnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts on behalf of the seller of securities when the seller does not have a direct relationship with the delivering agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#DeliverersCustodianDetails
	 * DeliveringPartiesAndAccount13.DeliverersCustodianDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#DeliverersCustodianDetails
	 * DeliveringPartiesAndAccount8.DeliverersCustodianDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DeliverersCustodianDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DeliveringPartiesAndAccount9.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "DlvrrsCtdnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetails";
			definition = "Party that acts on behalf of the seller of securities when the seller does not have a direct relationship with the delivering agent.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount8.DeliverersCustodianDetails;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount13.DeliverersCustodianDetails);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentificationAndAccount5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party that the deliverer's custodian uses to effect the delivery of a
	 * security, when the deliverer's custodian does not have a direct
	 * relationship with the delivering agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5
	 * PartyIdentificationAndAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsIntrmyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#DeliverersIntermediary1Details
	 * DeliveringPartiesAndAccount13.DeliverersIntermediary1Details}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#DeliverersIntermediaryDetails
	 * DeliveringPartiesAndAccount8.DeliverersIntermediaryDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DeliverersIntermediaryDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DeliveringPartiesAndAccount9.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "DlvrrsIntrmyDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetails";
			definition = "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount8.DeliverersIntermediaryDetails;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount13.DeliverersIntermediary1Details);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentificationAndAccount5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party that delivers securities to the receiving agent at the place of
	 * settlement, eg, central securities depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4
	 * PartyIdentificationAndAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, eg, central securities depository."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#DeliveringAgentDetails
	 * DeliveringPartiesAndAccount13.DeliveringAgentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#DeliveringAgentDetails
	 * DeliveringPartiesAndAccount8.DeliveringAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DeliveringAgentDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DeliveringPartiesAndAccount9.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, eg, central securities depository.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount8.DeliveringAgentDetails;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount13.DeliveringAgentDetails);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentificationAndAccount4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies the securities settlement system to be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the securities settlement system to be used."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#SecuritiesSettlementSystem
	 * DeliveringPartiesAndAccount13.SecuritiesSettlementSystem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#SecuritiesSettlementSystem
	 * DeliveringPartiesAndAccount8.SecuritiesSettlementSystem}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SecuritiesSettlementSystem = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DeliveringPartiesAndAccount9.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmSys";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Identifies the securities settlement system to be used.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount8.SecuritiesSettlementSystem;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount13.SecuritiesSettlementSystem);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Place where settlement of the securities takes place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification21
	 * PartyIdentification21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where settlement of the securities takes place."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#PlaceOfSettlementDetails
	 * DeliveringPartiesAndAccount13.PlaceOfSettlementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#PlaceOfSettlementDetails
	 * DeliveringPartiesAndAccount8.PlaceOfSettlementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PlaceOfSettlementDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DeliveringPartiesAndAccount9.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "PlcOfSttlmDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSettlementDetails";
			definition = "Place where settlement of the securities takes place.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount8.PlaceOfSettlementDetails;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount13.PlaceOfSettlementDetails);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification21.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount9.DelivererDetails, com.tools20022.repository.msg.DeliveringPartiesAndAccount9.DeliverersCustodianDetails,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount9.DeliverersIntermediaryDetails, com.tools20022.repository.msg.DeliveringPartiesAndAccount9.DeliveringAgentDetails,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount9.SecuritiesSettlementSystem, com.tools20022.repository.msg.DeliveringPartiesAndAccount9.PlaceOfSettlementDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DeliveringPartiesAndAccount9";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
				previousVersion_lazy = () -> DeliveringPartiesAndAccount8.mmObject();
				nextVersions_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount13.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}