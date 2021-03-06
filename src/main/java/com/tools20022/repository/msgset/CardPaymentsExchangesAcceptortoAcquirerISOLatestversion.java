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

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.caaa.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages that support transactions and services that are related to
 * card payments between a card acceptor and a card transaction acquirer. It
 * includes the authorisation, cancellation and capture of card transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV05
 * AcceptorRejectionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV07
 * AcceptorCompletionAdviceResponseV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV05
 * AcceptorCurrencyConversionRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV07
 * AcceptorDiagnosticRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV07
 * AcceptorCancellationResponseV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV07
 * AcceptorAuthorisationResponseV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV02
 * AcceptorCurrencyConversionAdviceResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV07
 * AcceptorCancellationAdviceResponseV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV06
 * AcceptorReconciliationResponseV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceV02
 * AcceptorCurrencyConversionAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV07
 * AcceptorCompletionAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07
 * AcceptorAuthorisationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV07
 * AcceptorReconciliationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV06
 * AcceptorDiagnosticResponseV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV07
 * AcceptorBatchTransferResponseV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV07
 * AcceptorBatchTransferV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV07
 * AcceptorCancellationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV07
 * AcceptorCancellationAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV05
 * AcceptorCurrencyConversionResponseV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Card Payments Exchanges - Acceptor to Acquirer  - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages that support transactions and services that are related to card payments between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CardPaymentsExchangesAcceptortoAcquirerISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Card Payments Exchanges - Acceptor to Acquirer  - ISO - Latest version";
				definition = "Set of messages that support transactions and services that are related to card payments between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions.";
				messageDefinition_lazy = () -> Arrays.asList(AcceptorRejectionV05.mmObject(), AcceptorCompletionAdviceResponseV07.mmObject(), AcceptorCurrencyConversionRequestV05.mmObject(), AcceptorDiagnosticRequestV07.mmObject(),
						AcceptorCancellationResponseV07.mmObject(), AcceptorAuthorisationResponseV07.mmObject(), AcceptorCurrencyConversionAdviceResponseV02.mmObject(), AcceptorCancellationAdviceResponseV07.mmObject(),
						AcceptorReconciliationResponseV06.mmObject(), AcceptorCurrencyConversionAdviceV02.mmObject(), AcceptorCompletionAdviceV07.mmObject(), AcceptorAuthorisationRequestV07.mmObject(),
						AcceptorReconciliationRequestV07.mmObject(), AcceptorDiagnosticResponseV06.mmObject(), AcceptorBatchTransferResponseV07.mmObject(), AcceptorBatchTransferV07.mmObject(), AcceptorCancellationRequestV07.mmObject(),
						AcceptorCancellationAdviceV07.mmObject(), AcceptorCurrencyConversionResponseV05.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}