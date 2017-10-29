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
import com.tools20022.repository.codeset.ContentType1Code;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * General cryptographic message syntax (CMS) containing authenticated data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType8#ContentType
 * ContentInformationType8.ContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType8#AuthenticatedData
 * ContentInformationType8.AuthenticatedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV03#SecurityTrailer
 * AcceptorCancellationAdviceResponseV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV03#SecurityTrailer
 * AcceptorDiagnosticResponseV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01#SecurityTrailer
 * AcceptorCurrencyConversionResponseV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV03#SecurityTrailer
 * AcceptorCancellationResponseV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03#SecurityTrailer
 * AcceptorCancellationRequestV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV01#SecurityTrailer
 * AcceptorCurrencyConversionRequestV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV03#SecurityTrailer
 * AcceptorReconciliationResponseV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV03#SecurityTrailer
 * AcceptorCompletionAdviceResponseV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV03#SecurityTrailer
 * AcceptorDiagnosticRequestV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV03#SecurityTrailer
 * AcceptorAuthorisationRequestV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV03#SecurityTrailer
 * AcceptorCompletionAdviceV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV03#SecurityTrailer
 * AcceptorCancellationAdviceV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV03#SecurityTrailer
 * AcceptorReconciliationRequestV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV03#SecurityTrailer
 * AcceptorAuthorisationResponseV03.SecurityTrailer}</li>
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
 * "ContentInformationType8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing authenticated data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType11
 * ContentInformationType11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ContentInformationType6
 * ContentInformationType6}</li>
 * </ul>
 */
public class ContentInformationType8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of data protection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType8
	 * ContentInformationType8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of data protection."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType11#ContentType
	 * ContentInformationType11.ContentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType6#ContentType
	 * ContentInformationType6.ContentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContentInformationType8.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType6.ContentType;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType11.ContentType);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ContentType1Code.mmObject();
		}
	};
	/**
	 * Data protection by a message authentication code (MAC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData3
	 * AuthenticatedData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType8
	 * ContentInformationType8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protection by a message authentication code (MAC)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType11#AuthenticatedData
	 * ContentInformationType11.AuthenticatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType6#AuthenticatedData
	 * ContentInformationType6.AuthenticatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AuthenticatedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType8.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType6.AuthenticatedData;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType11.AuthenticatedData);
			minOccurs = 0;
			type_lazy = () -> AuthenticatedData3.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType8.ContentType, com.tools20022.repository.msg.ContentInformationType8.AuthenticatedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV03.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV03.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCancellationResponseV03.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV01.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV03.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV03.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV03.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV03.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV03.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV03.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV03.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV03.SecurityTrailer);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType8";
				definition = "General cryptographic message syntax (CMS) containing authenticated data.";
				previousVersion_lazy = () -> ContentInformationType6.mmObject();
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}