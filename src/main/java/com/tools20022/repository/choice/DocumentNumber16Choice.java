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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.ISO20022MessageIdentificationText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification163;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a short document number, a long document number or a
 * proprietary document number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentNumber16Choice#mmShortNumber
 * DocumentNumber16Choice.mmShortNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentNumber16Choice#mmLongNumber
 * DocumentNumber16Choice.mmLongNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentNumber16Choice#mmProprietaryNumber
 * DocumentNumber16Choice.mmProprietaryNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintShortLongNumberRule#forDocumentNumber16Choice
 * ConstraintShortLongNumberRule.forDocumentNumber16Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentNumber16Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a short document number, a long document number or a proprietary document number."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentNumber16Choice", propOrder = {"shortNumber", "longNumber", "proprietaryNumber"})
public class DocumentNumber16Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ShrtNb", required = true)
	protected Exact3NumericText shortNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber16Choice
	 * DocumentNumber16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A::LINK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message type number of the document referenced."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DocumentNumber16Choice.mmObject();
			isDerived = false;
			xmlTag = "ShrtNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortNumber";
			definition = "Message type number of the document referenced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	@XmlElement(name = "LngNb", required = true)
	protected ISO20022MessageIdentificationText longNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISO20022MessageIdentificationText
	 * ISO20022MessageIdentificationText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber16Choice
	 * DocumentNumber16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13B::LINK//30x</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MX Message identifier of the referenced document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLongNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DocumentNumber16Choice.mmObject();
			isDerived = false;
			xmlTag = "LngNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13B::LINK//30x"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongNumber";
			definition = "MX Message identifier of the referenced document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISO20022MessageIdentificationText.mmObject();
		}
	};
	@XmlElement(name = "PrtryNb", required = true)
	protected GenericIdentification163 proprietaryNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification163
	 * GenericIdentification163}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber16Choice
	 * DocumentNumber16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13B::LINK/[8c]/30x</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary document identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DocumentNumber16Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13B::LINK/[8c]/30x"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryNumber";
			definition = "Proprietary document identification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification163.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DocumentNumber16Choice.mmShortNumber, com.tools20022.repository.choice.DocumentNumber16Choice.mmLongNumber,
						com.tools20022.repository.choice.DocumentNumber16Choice.mmProprietaryNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintShortLongNumberRule.forDocumentNumber16Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentNumber16Choice";
				definition = "Choice between a short document number, a long document number or a proprietary document number.";
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getShortNumber() {
		return shortNumber;
	}

	public DocumentNumber16Choice setShortNumber(Exact3NumericText shortNumber) {
		this.shortNumber = Objects.requireNonNull(shortNumber);
		return this;
	}

	public ISO20022MessageIdentificationText getLongNumber() {
		return longNumber;
	}

	public DocumentNumber16Choice setLongNumber(ISO20022MessageIdentificationText longNumber) {
		this.longNumber = Objects.requireNonNull(longNumber);
		return this;
	}

	public GenericIdentification163 getProprietaryNumber() {
		return proprietaryNumber;
	}

	public DocumentNumber16Choice setProprietaryNumber(GenericIdentification163 proprietaryNumber) {
		this.proprietaryNumber = Objects.requireNonNull(proprietaryNumber);
		return this;
	}
}