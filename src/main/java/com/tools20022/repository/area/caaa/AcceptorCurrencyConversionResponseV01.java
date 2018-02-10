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

package com.tools20022.repository.area.caaa;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionPreviousVersion;
import com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1;
import com.tools20022.repository.msg.ContentInformationType8;
import com.tools20022.repository.msg.Header7;
import com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20132014;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorCurrencyConversionResponse message is sent by currency conversion
 * service provider to the card acceptor to return the result of a potential
 * currency conversion for the cardholder.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01#mmHeader
 * AcceptorCurrencyConversionResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01#mmCurrencyConversionResponse
 * AcceptorCurrencyConversionResponseV01.mmCurrencyConversionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01#mmSecurityTrailer
 * AcceptorCurrencyConversionResponseV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20132014
 * CAPEAcceptortoAcquirerMaintenance20132014}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrCcyConvsRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionPreviousVersion
 * AcceptortoAcquirerCardTransactionPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.017.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCurrencyConversionResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorCurrencyConversionResponse message is sent by currency conversion service provider to the card acceptor to return the result of a potential currency conversion for the cardholder.\r\n"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02
 * AcceptorCurrencyConversionResponseV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorCurrencyConversionResponseV01", propOrder = {"header", "currencyConversionResponse", "securityTrailer"})
public class AcceptorCurrencyConversionResponseV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header7 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header7 Header7}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency conversion response message management information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02#mmHeader
	 * AcceptorCurrencyConversionResponseV02.mmHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Currency conversion response message management information.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponseV02.mmHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorCurrencyConversionResponseV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CcyConvsRspn", required = true)
	protected AcceptorCurrencyConversionResponse1 currencyConversionResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1
	 * AcceptorCurrencyConversionResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the outcome of the currency conversion."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02#mmCurrencyConversionResponse
	 * AcceptorCurrencyConversionResponseV02.mmCurrencyConversionResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCurrencyConversionResponse = new MMMessageBuildingBlock() {
		{
			xmlTag = "CcyConvsRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResponse";
			definition = "Information related to the outcome of the currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponseV02.mmCurrencyConversionResponse);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorCurrencyConversionResponse1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorCurrencyConversionResponseV01.class.getMethod("getCurrencyConversionResponse", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SctyTrlr", required = true)
	protected ContentInformationType8 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType8
	 * ContentInformationType8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trailer of the message containing a MAC (message authentication code)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02#mmSecurityTrailer
	 * AcceptorCurrencyConversionResponseV02.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC (message authentication code).";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponseV02.mmSecurityTrailer);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorCurrencyConversionResponseV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCurrencyConversionResponseV01";
				definition = "The AcceptorCurrencyConversionResponse message is sent by currency conversion service provider to the card acceptor to return the result of a potential currency conversion for the cardholder.\r\n";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponseV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject(), CAPEAcceptortoAcquirerMaintenance20132014.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCcyConvsRspn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01.mmHeader,
						com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01.mmCurrencyConversionResponse, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "017";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorCurrencyConversionResponseV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header7 getHeader() {
		return header;
	}

	public AcceptorCurrencyConversionResponseV01 setHeader(Header7 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorCurrencyConversionResponse1 getCurrencyConversionResponse() {
		return currencyConversionResponse;
	}

	public AcceptorCurrencyConversionResponseV01 setCurrencyConversionResponse(AcceptorCurrencyConversionResponse1 currencyConversionResponse) {
		this.currencyConversionResponse = Objects.requireNonNull(currencyConversionResponse);
		return this;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return securityTrailer;
	}

	public AcceptorCurrencyConversionResponseV01 setSecurityTrailer(ContentInformationType8 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.017.001.01")
	static public class Document {
		@XmlElement(name = "AccptrCcyConvsRspn", required = true)
		public AcceptorCurrencyConversionResponseV01 messageBody;
	}
}