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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.choice.DocumentIdentification1Choice;
import com.tools20022.repository.choice.DocumentNumber1Choice;
import com.tools20022.repository.choice.ProcessingPosition1Choice;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a document as well as the document number and type of link.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13#mmIdentification
 * DocumentIdentification13.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13#mmDocumentNumber
 * DocumentIdentification13.mmDocumentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13#mmLinkageType
 * DocumentIdentification13.mmLinkageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#mmOtherDocumentIdentification
 * CorporateActionInstructionV01.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02#mmOtherDocumentIdentification
 * CorporateActionInstructionV02.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03#mmOtherDocumentIdentification
 * CorporateActionInstructionV03.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04#mmOtherDocumentIdentification
 * CorporateActionInstructionV04.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmOtherDocumentIdentification
 * CorporateActionMovementConfirmationV01.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#mmOtherDocumentIdentification
 * CorporateActionMovementConfirmationV02.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#mmOtherDocumentIdentification
 * CorporateActionMovementConfirmationV03.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#mmOtherDocumentIdentification
 * CorporateActionMovementConfirmationV04.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV01.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV02.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV03.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV04.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV01.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV02.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV03.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV04.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmOtherDocumentIdentification
 * CorporateActionNotificationV01.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmOtherDocumentIdentification
 * CorporateActionNotificationV02.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmOtherDocumentIdentification
 * CorporateActionNotificationV03.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmOtherDocumentIdentification
 * CorporateActionNotificationV04.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#mmOtherDocumentIdentification
 * CorporateActionMovementConfirmationV05.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmOtherDocumentIdentification
 * CorporateActionNotificationV05.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV05.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05#mmOtherDocumentIdentification
 * CorporateActionInstructionV05.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV05.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06#mmOtherDocumentIdentification
 * CorporateActionMovementConfirmationV06.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV06.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV06.mmOtherDocumentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentIdentification13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a document as well as the document number and type of link."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification32
 * DocumentIdentification32}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentIdentification13", propOrder = {"identification", "documentNumber", "linkageType"})
public class DocumentIdentification13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification1Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification1Choice
	 * DocumentIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13
	 * DocumentIdentification13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of the document (message) assigned either by the account servicer or the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32#mmIdentification
	 * DocumentIdentification32.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DocumentIdentification13, DocumentIdentification1Choice> mmIdentification = new MMMessageAssociationEnd<DocumentIdentification13, DocumentIdentification1Choice>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentIdentification13.mmObject();
			isDerived = false;
			xmlTag = "Id";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifier of the document (message) assigned either by the account servicer or the account owner.";
			nextVersions_lazy = () -> Arrays.asList(DocumentIdentification32.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification1Choice.mmObject();
		}

		@Override
		public DocumentIdentification1Choice getValue(DocumentIdentification13 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(DocumentIdentification13 obj, DocumentIdentification1Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "DocNb")
	protected DocumentNumber1Choice documentNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber1Choice
	 * DocumentNumber1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13
	 * DocumentIdentification13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::LINK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32#mmDocumentNumber
	 * DocumentIdentification32.mmDocumentNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DocumentIdentification13, Optional<DocumentNumber1Choice>> mmDocumentNumber = new MMMessageAssociationEnd<DocumentIdentification13, Optional<DocumentNumber1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentIdentification13.mmObject();
			isDerived = false;
			xmlTag = "DocNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentNumber";
			definition = "Identification of the type of document.";
			nextVersions_lazy = () -> Arrays.asList(DocumentIdentification32.mmDocumentNumber);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentNumber1Choice.mmObject();
		}

		@Override
		public Optional<DocumentNumber1Choice> getValue(DocumentIdentification13 obj) {
			return obj.getDocumentNumber();
		}

		@Override
		public void setValue(DocumentIdentification13 obj, Optional<DocumentNumber1Choice> value) {
			obj.setDocumentNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "LkgTp")
	protected ProcessingPosition1Choice linkageType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition1Choice
	 * ProcessingPosition1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13
	 * DocumentIdentification13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkgTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies when this document is to be processed relative to an other referred document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LINK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32#mmLinkageType
	 * DocumentIdentification32.mmLinkageType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DocumentIdentification13, Optional<ProcessingPosition1Choice>> mmLinkageType = new MMMessageAssociationEnd<DocumentIdentification13, Optional<ProcessingPosition1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentIdentification13.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this document is to be processed relative to an other referred document.";
			nextVersions_lazy = () -> Arrays.asList(DocumentIdentification32.mmLinkageType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition1Choice.mmObject();
		}

		@Override
		public Optional<ProcessingPosition1Choice> getValue(DocumentIdentification13 obj) {
			return obj.getLinkageType();
		}

		@Override
		public void setValue(DocumentIdentification13 obj, Optional<ProcessingPosition1Choice> value) {
			obj.setLinkageType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification13.mmIdentification, com.tools20022.repository.msg.DocumentIdentification13.mmDocumentNumber,
						com.tools20022.repository.msg.DocumentIdentification13.mmLinkageType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionV01.mmOtherDocumentIdentification, CorporateActionInstructionV02.mmOtherDocumentIdentification,
						CorporateActionInstructionV03.mmOtherDocumentIdentification, CorporateActionInstructionV04.mmOtherDocumentIdentification, CorporateActionMovementConfirmationV01.mmOtherDocumentIdentification,
						CorporateActionMovementConfirmationV02.mmOtherDocumentIdentification, CorporateActionMovementConfirmationV03.mmOtherDocumentIdentification, CorporateActionMovementConfirmationV04.mmOtherDocumentIdentification,
						CorporateActionMovementPreliminaryAdviceV01.mmOtherDocumentIdentification, CorporateActionMovementPreliminaryAdviceV02.mmOtherDocumentIdentification,
						CorporateActionMovementPreliminaryAdviceV03.mmOtherDocumentIdentification, CorporateActionMovementPreliminaryAdviceV04.mmOtherDocumentIdentification,
						CorporateActionMovementReversalAdviceV01.mmOtherDocumentIdentification, CorporateActionMovementReversalAdviceV02.mmOtherDocumentIdentification, CorporateActionMovementReversalAdviceV03.mmOtherDocumentIdentification,
						CorporateActionMovementReversalAdviceV04.mmOtherDocumentIdentification, CorporateActionNotificationV01.mmOtherDocumentIdentification, CorporateActionNotificationV02.mmOtherDocumentIdentification,
						CorporateActionNotificationV03.mmOtherDocumentIdentification, CorporateActionNotificationV04.mmOtherDocumentIdentification, CorporateActionMovementConfirmationV05.mmOtherDocumentIdentification,
						CorporateActionNotificationV05.mmOtherDocumentIdentification, CorporateActionMovementPreliminaryAdviceV05.mmOtherDocumentIdentification, CorporateActionInstructionV05.mmOtherDocumentIdentification,
						CorporateActionMovementReversalAdviceV05.mmOtherDocumentIdentification, CorporateActionMovementConfirmationV06.mmOtherDocumentIdentification,
						CorporateActionMovementPreliminaryAdviceV06.mmOtherDocumentIdentification, CorporateActionMovementReversalAdviceV06.mmOtherDocumentIdentification);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification13";
				definition = "Identification of a document as well as the document number and type of link.";
				nextVersions_lazy = () -> Arrays.asList(DocumentIdentification32.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification1Choice getIdentification() {
		return identification;
	}

	public DocumentIdentification13 setIdentification(DocumentIdentification1Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<DocumentNumber1Choice> getDocumentNumber() {
		return documentNumber == null ? Optional.empty() : Optional.of(documentNumber);
	}

	public DocumentIdentification13 setDocumentNumber(DocumentNumber1Choice documentNumber) {
		this.documentNumber = documentNumber;
		return this;
	}

	public Optional<ProcessingPosition1Choice> getLinkageType() {
		return linkageType == null ? Optional.empty() : Optional.of(linkageType);
	}

	public DocumentIdentification13 setLinkageType(ProcessingPosition1Choice linkageType) {
		this.linkageType = linkageType;
		return this;
	}
}